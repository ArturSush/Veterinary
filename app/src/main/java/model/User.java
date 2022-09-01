package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name="age")
    private Integer age;
    @Column(name="email")
    private String email;
    @Column(name="pass")
    private String pass;
    @Column(name="confPass")
    private String confPass;
    @OneToMany
    @Column(name="animals")
    private List<Animal> listOfAnimals;


    public User(Integer id, String name, Integer age, String email, String pass, String confPass, List<Animal> listOfAnimals) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.pass = pass;
        this.confPass = confPass;
        this.listOfAnimals = listOfAnimals;
    }

    public User() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfPass() {
        return confPass;
    }

    public void setConfPass(String confPass) {
        this.confPass = confPass;
    }

    public List<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

    public void setListOfAnimals(List<Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }
}
