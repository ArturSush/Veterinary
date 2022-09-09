package com.zoo.app.service;

import com.zoo.app.dto.AnimalResponse;
import com.zoo.app.model.Animal;
import com.zoo.app.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AnimalService {
    AnimalResponse addAnimal();
    AnimalResponse deleteAnimal(int id);
    AnimalResponse updateAnimal(Animal animal);
    Animal getAnimalById(int id);
    List<Event> getEventList(Animal animal);
    Animal addEventToAnimalById (int id);
}
