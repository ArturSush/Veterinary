package com.zoo.app.controller;

import com.zoo.app.service.AnimalService;
import com.zoo.app.dto.AnimalResponse;
import com.zoo.app.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimalController {

//    @Autowired
    private AnimalService service;



    @PutMapping("/update/animal")
    public AnimalResponse updateAnimal(@RequestBody Animal animal) {
        return service.updateAnimal(animal);
    }

    @DeleteMapping("/delete/animal/{id}")
    public AnimalResponse deleteAnimal(@PathVariable(name = "id") Integer id) {
        return service.deleteAnimal(id);
    }

    @PostMapping("/createAnimal")
    public AnimalResponse addAnimal() {
        return service.addAnimal();
    }

    @GetMapping("/getAnimal")
    public Animal getAnimalById(@PathVariable(name = "id") Integer id) {
        return service.getAnimalById(id);
    }



}
