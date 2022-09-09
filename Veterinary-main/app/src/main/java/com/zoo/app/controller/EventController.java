package com.zoo.app.controller;

import com.zoo.app.model.Event;
import com.zoo.app.service.EventService;
import com.zoo.app.dto.EventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {
//    @Autowired
    private EventService service;

    @GetMapping("/getEvenetById")
    public Event getEvent(@PathVariable(name = "id") Integer id){
        return service.getEventById(id);
    }

    @PutMapping("/update/event")
    public EventResponse updateAnimal(@RequestBody Event event) {
        return service.updateEvent(event);
    }

    @PostMapping("/createEvent")
    public Event addEvent() {
        return service.createEvent();
    }


}
