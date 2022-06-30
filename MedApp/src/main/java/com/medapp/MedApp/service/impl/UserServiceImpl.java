package com.medapp.MedApp.service.impl;

import com.medapp.MedApp.dto.bean.UserNameBean;
import com.medapp.MedApp.dto.request.CreateUserRequest;
import com.medapp.MedApp.dto.response.CreateUserResponse;
import com.medapp.MedApp.model.Animal;
import com.medapp.MedApp.model.User;
import com.medapp.MedApp.repositoty.AnimalRepository;
import com.medapp.MedApp.repositoty.UserRepository;
import com.medapp.MedApp.service.AnimalService;
import com.medapp.MedApp.service.UserService;
import com.medapp.MedApp.util.BaseResponse;
import com.medapp.MedApp.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AnimalService animalsService;


    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        User user = UserMapper.userBeanToUser(request.getUserToCreate());
        User savedUser = repository.save(user);
        return new CreateUserResponse(200, "vso ok",
                UserMapper.toUserCreateRespose(savedUser));
    }

    @Override
    public BaseResponse deleteUser(Integer userId) {
        return repository.deleteById(userId);
    }

    @Override
    public User updateUser(User user) {
        UserNameBean userNameBean = UserMapper.toUserNameBean(
                repository.findById(user.getId()).orElse(null);

        );
        if(Objects.nonNull(user1)){
            userNameBean.setName(user.getName());
            userNameBean.setLastName(user.getLastName());
        }
        return UserMapper.userBeanToUser(repository.save(user1));
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
    @Override
    public User getUserById(Integer userId) {
        return repository.findById(userId)
                .orElse(null);
    }

    @Override
    public BaseResponse addAnimalsToUser(List<Integer> roomsId, Integer userId) {
        List<Animal> allAnimalsByIds = animalsService.getAllAnimalsByIds(roomsId);
        User userById = getUserById(userId);
        if(!allAnimalsByIds.isEmpty() && Objects.nonNull(userById)){
            userById.setAnimals(allAnimalsByIds);
            User save = repository.save(userById);
            return new BaseResponse(200, "Animal is added *_*", save);
        }
        return new BaseResponse(400, "Animal or user is not found o_o " +
                "user:" + userById +
                "rooms:" + roomsId,
                null);
    }
}
