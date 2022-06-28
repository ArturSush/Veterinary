package com.medapp.MedApp.model;


import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@ToString
@Entity
@Table(name = "user_app")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "role")
    private String role;

    @OneToMany
    private List<Animal> animals;

    public User() {
    }

    public User(Integer id, String name, String lastName, String role, List<Animal> animals) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.role = role;
        this.animals = animals;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Animal> getRooms() {
        return animals;
    }

    public void setAnimals(List<Animal> rooms) {
        this.animals = animals;
    }
}