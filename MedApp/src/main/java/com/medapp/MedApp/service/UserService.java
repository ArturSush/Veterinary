package com.medapp.MedApp.service;

import com.medapp.MedApp.dto.request.CreateUserRequest;
import com.medapp.MedApp.dto.response.CreateUserResponse;
import com.medapp.MedApp.model.User;
import com.medapp.MedApp.util.BaseResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    CreateUserResponse createUser(CreateUserRequest request);
    BaseResponse deleteUser(Integer userId);
    User updateUser(User user);
    List<User> getAllUsers();
    User getUserById(Integer userId);
    BaseResponse addRoomToUser(List<Integer> roomsId, Integer userId);
}
