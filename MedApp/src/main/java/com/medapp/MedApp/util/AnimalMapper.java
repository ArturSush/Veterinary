package com.medapp.MedApp.util;

import com.medapp.MedApp.dto.bean.Animal.AnimalBean;
import com.medapp.MedApp.dto.bean.Animal.AnimalNameBean;
import com.medapp.MedApp.dto.bean.Animal.CreateAnimalBean;
import com.medapp.MedApp.dto.bean.User.UserNameBean;
import com.medapp.MedApp.model.Animal;
import com.medapp.MedApp.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnimalMapper {



    public static AnimalBean animalToAnimalBean(Animal animal) {
        AnimalBean animalBean = null;
        if (Objects.nonNull(animal)) {
            animalBean = new AnimalBean();
            animalBean.setId(animal.getId());
            animalBean.setUserId(animal.getUserId());
        }
        return animalBean;
    }

    public static Animal AnimalBeanToAnimal(CreateAnimalBean bean){
        Animal animal = null;
        if(Objects.nonNull(bean)){
            animal = new Animal();
            animal.setNickname(bean.getNickname());
            animal.setId(bean.getId());
        }
        return animal;
    }

    public static Animal AnimalBeanToAnimal(AnimalBean bean){
        Animal animal = null;
        if(Objects.nonNull(bean)){
            animal = new Animal();
            animal.setNickname(bean.getNickname());
            animal.setId(bean.getId());
        }
        return animal;
    }

    public static List<AnimalBean> animalListToAnimalBeanList(List<Animal> animals) {
        List<AnimalBean> animalBeans = new ArrayList<>();
        if (!animals.isEmpty()) {
            for (Animal room : animals) {
                animalBeans.add(animalToAnimalBean(room));
            }
        }
        return animalBeans;
    }

    public static AnimalBean toAnimalCreateResponse(Animal savedAnimal) {

        return ;
    }
    public static AnimalNameBean toAnimalNameBean(Animal animal) {

        return null;
    }

}
