package com.medapp.MedApp.controller;


import com.medapp.MedApp.dto.request.CreateUserRequest;
import com.medapp.MedApp.dto.response.CreateUserResponse;
import com.medapp.MedApp.model.User;
import com.medapp.MedApp.service.UserService;
import com.medapp.MedApp.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/createUser")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
        return service.createUser(request);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return service.getAllUsers();
    }

    @DeleteMapping("/delete/user/{id}")
    public BaseResponse deleteDog(@PathVariable(name = "id") Integer id) {
        return service.deleteUser(id);
    }

    @PutMapping("/update/user")
    public User updateDog(@RequestBody User user) {
        return service.updateUser(user);
    }
}
