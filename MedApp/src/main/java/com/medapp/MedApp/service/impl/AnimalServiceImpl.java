package com.medapp.MedApp.service.impl;

import com.medapp.MedApp.model.Animal;
import com.medapp.MedApp.repositoty.AnimalRepository;
import com.medapp.MedApp.service.AnimalService;
import com.medapp.MedApp.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository repository;




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
        return null;
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
    public List<Animal> getAllAnimalsByIds(List<Integer> animalIds) {
        return null;
    }
}
