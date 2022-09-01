package service;

import dto.AnimalResponse;
import model.Animal;
import model.Event;
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
