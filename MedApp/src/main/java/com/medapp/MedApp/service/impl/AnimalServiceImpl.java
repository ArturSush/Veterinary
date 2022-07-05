package com.medapp.MedApp.service.impl;

import com.medapp.MedApp.dto.bean.Animal.AnimalBean;
import com.medapp.MedApp.dto.bean.Animal.AnimalNameBean;
import com.medapp.MedApp.dto.bean.User.UserNameBean;
import com.medapp.MedApp.dto.request.CreateAnimalRequest;
import com.medapp.MedApp.dto.response.CreateAnimalResponse;
import com.medapp.MedApp.dto.response.UpdateUserResponse;
import com.medapp.MedApp.model.Animal;
import com.medapp.MedApp.model.User;
import com.medapp.MedApp.repositoty.AnimalRepository;
import com.medapp.MedApp.service.AnimalService;
import com.medapp.MedApp.util.AnimalMapper;
import com.medapp.MedApp.util.BaseResponse;
import com.medapp.MedApp.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository repository;

    @Override
    public CreateAnimalResponse createAnimal(CreateAnimalRequest request){
        Animal animal;
        if(Objects.nonNull(request)) {
            animal = AnimalMapper.AnimalBeanToAnimal(request.getCreateAnimalBean());
            repository.save(animal);
            return new CreateAnimalResponse(200, "Animal was created");
        }
        return new CreateAnimalResponse(404, "Request was wrong");
    }

    @Override
    public BaseResponse deleteAnimal(Integer animalId) {
        if(Objects.nonNull(repository.findById(animalId))){
        repository.deleteById(animalId);
        return new BaseResponse(200, "Animal successfully delete");}
        return new BaseResponse(404, "Animal delete error");
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        AnimalNameBean animalNameBean = AnimalMapper.toAnimalNameBean(animal);
        Animal animal1 =  repository.findById(animal.getId()).orElse(null);
        if(Objects.nonNull(animalNameBean)){
            animal1.setName(animalNameBean.getNickname());
            repository.save(animal1);
            new UpdateAnimalResponse(200, "Animal update successfully", animal1);
            return animal1;
        }
        new UpdateAnimalResponse(200, "Animal update error",null) ;
        return null;
    }


    @Override
    public List<Animal> getAllAnimals() {
        return repository.findAll();
    }

    @Override
    public Animal getAnimalById(Integer animalId) {
        return repository.getById(animalId);
    }

    @Override
    public Animal getAnimalByUserId(Integer userId) {
        return repository.findAnimalByUserId(userId);
    }

    @Override
    public BaseResponse appointment(Integer animalId, Integer userId) {
        return null;
    }

    @Override
    public BaseResponse deregisterReception(Integer animalId) {
        return null;
    }

    @Override
    public List<AnimalBean> getAllAnimalsByIds(List<Integer> animalIds) {
        List<Animal> animalList = repository.findAllByIdIn(animalIds);
        return AnimalMapper.animalListToAnimalBeanList(animalList);
    }
}
