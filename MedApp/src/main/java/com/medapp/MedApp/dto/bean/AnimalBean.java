package com.medapp.MedApp.dto.bean;

import com.medapp.MedApp.model.AnimalEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimalBean {
    private String nickname;
    private Integer age;
    private Integer ownerId;
    private List<AnimalEvent> animalEvents;

}
