package com.medapp.MedApp.controller;

import com.medapp.MedApp.dto.request.CreateAnimalRequest;
import com.medapp.MedApp.dto.request.CreateUserRequest;
import com.medapp.MedApp.dto.response.CreateUserResponse;
import com.medapp.MedApp.model.Animal;
import com.medapp.MedApp.model.User;
import com.medapp.MedApp.service.AnimalService;
import com.medapp.MedApp.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService service;

    @PostMapping("/createAnimal")
    public CreateUserResponse createUser(@RequestBody CreateAnimalRequest request) {
        return service.createAnimal(request);
    }

    @GetMapping("/getAllAnimal")
    public List<Animal> getAllAnimal() {
        return service.getAllAnimals();
    }

    @DeleteMapping("/delete/animal/{id}")
    public BaseResponse deleteAnimal(@PathVariable(name = "id") Integer id) {
        return service.deleteAnimal(id);
    }

    @PutMapping("/update/animal")
    public Animal updateAnimal(@RequestBody Animal animal) {
        return service.updateAnimal(animal);
    }

}
