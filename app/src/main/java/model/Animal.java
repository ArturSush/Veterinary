package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="animal_table")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="animalId")
    private Integer animalId;
    @Column(name="nickname")
    private String nickname;
    @Column(name="age")
    private Integer age;
    @Column(name="breed")
    private String breed;
    @OneToMany
    @Column(name="events")
    private List<Event> listOfEvent;

    public Animal(Integer animalId, String nickname, Integer age, String breed, List<Event> listOfEvent) {
        this.animalId = animalId;
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;
        this.listOfEvent = listOfEvent;
    }

    public Animal() {
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<Event> getListOfEvent() {
        return listOfEvent;
    }

    public void setListOfEvent(List<Event> listOfEvent) {
        this.listOfEvent = listOfEvent;
    }
}
