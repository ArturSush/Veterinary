package com.medapp.MedApp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "nickname")
    private String nickname;
    @OneToMany(fetch = FetchType.EAGER)
    private List<AnimalEvent> animalEvents;
}
