package com.medapp.MedApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AnimalEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "animal_id")
    private Integer roomId;

    @Column(name = "start_of_reception")
    private Date startOfRecep;

    @Column(name = "info_about_reception")
    private String infoAboutRecep;

    @Column(name = "end_of_reception")
    private Date endOfRecep;




}
