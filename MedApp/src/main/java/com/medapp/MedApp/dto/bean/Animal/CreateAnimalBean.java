package com.medapp.MedApp.dto.bean.Animal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAnimalBean {
    private String nickname;
    private Integer age;
    private String owner;
}
