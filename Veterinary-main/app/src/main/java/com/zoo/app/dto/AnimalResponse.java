package com.zoo.app.dto;

import com.zoo.app.model.Animal;

public class AnimalResponse {
    private Animal animal;
    private String info;

    public AnimalResponse() {
    }

    public AnimalResponse(Animal animal, String info) {
        this.animal = animal;
        this.info = info;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
