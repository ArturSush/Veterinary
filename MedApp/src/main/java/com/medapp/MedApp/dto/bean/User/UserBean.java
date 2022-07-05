package com.medapp.MedApp.dto.bean.User;

import com.medapp.MedApp.model.Animal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {
    private Integer id;
    private String name;
    private String lastName;
    private String role;
    private List<Animal> animals;
}
