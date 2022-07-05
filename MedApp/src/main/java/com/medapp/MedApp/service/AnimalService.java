package com.medapp.MedApp.service;

import com.medapp.MedApp.dto.request.CreateAnimalRequest;
import com.medapp.MedApp.dto.response.CreateAnimalResponse;
import com.medapp.MedApp.model.Animal;
import com.medapp.MedApp.util.BaseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnimalService {
    CreateAnimalResponse createAnimal(CreateAnimalRequest request);
    BaseResponse deleteAnimal(Integer animalId);
    Animal updateAnimal(Animal animal);
    List<Animal> getAllAnimals();
    Animal getAnimalById(Integer animalId);
    Animal getAnimalByUserId(Integer userId);
    BaseResponse appointment (Integer animalId, Integer userId);
    BaseResponse deregisterReception(Integer animalId);
    List<Animal> getAllAnimalsByIds(List<Integer> animalIds);

}
