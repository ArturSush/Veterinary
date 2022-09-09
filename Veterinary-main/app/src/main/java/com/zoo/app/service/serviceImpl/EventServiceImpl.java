package com.zoo.app.service.serviceImpl;

import com.zoo.app.dto.EventResponse;
import com.zoo.app.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import com.zoo.app.repository.EventRepository;
import com.zoo.app.service.EventService;

import java.util.Objects;

public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository repository;

    @Override
    public Event createEvent() {
        return new Event();
    }

    @Override
    public EventResponse updateEvent(Event event) {
        Event event1 = repository.findById(event.getEventId()).orElse(null);
        if(Objects.nonNull(event)){
            event1.setInfo(event.getInfo());
            repository.save(event1);
        }
        return new EventResponse(event1,"Event was updated");
    }

    @Override
    public Event getEventById(int id) {
        return repository.findById(id).orElse(null);
    }
}
