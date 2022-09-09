package com.zoo.app.service.serviceImpl;

import com.zoo.app.dto.AnimalResponse;
import com.zoo.app.model.Animal;
import com.zoo.app.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import com.zoo.app.repository.AnimalRepository;
import com.zoo.app.service.AnimalService;

import java.util.List;
import java.util.Objects;

public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository repository;



    @Override
    public AnimalResponse addAnimal() {
        Animal animal = new Animal();
        repository.save(animal);
        return new AnimalResponse(animal,"Animal was created");
    }

    @Override
    public AnimalResponse deleteAnimal(int id) {
        repository.deleteById(id);
        return new AnimalResponse(getAnimalById(id),"Animal was deleted");
    }

    @Override
    public AnimalResponse updateAnimal(Animal animal) {
        Animal animal1 = repository.findById(animal.getAnimalId()).orElse(null);
        if(Objects.nonNull(animal)){
            animal1.setAge(animal.getAge());
            animal1.setBreed(animal.getBreed());
            animal1.setNickname(animal.getNickname());
            animal1.setListOfEvent(animal.getListOfEvent());

        }
        return new AnimalResponse(animal1,"Animal was updated");
    }

    @Override
    public Animal getAnimalById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Event> getEventList(Animal animal) {
        List<Event> events = animal.getListOfEvent();
        return events;
    }

    @Override
    public Animal addEventToAnimalById(int id) {
        Animal animal = repository.findById(id).orElse(null);
        List<Event> events = animal.getListOfEvent();
        EventServiceImpl eventToCreate = new EventServiceImpl();
        events.add(eventToCreate.createEvent());
        animal.setListOfEvent(events);
        return animal;
    }
}
