package com.medapp.MedApp.dto.bean.Animal;

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
    private Integer id;
    private String nickname;
    private Integer age;
    private Integer userId;
    private List<AnimalEvent> animalEvents;

}
