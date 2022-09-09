package com.zoo.app.service;

import com.zoo.app.dto.EventResponse;
import com.zoo.app.model.Event;
import org.springframework.stereotype.Service;

@Service
public interface EventService {
    Event createEvent ();
    EventResponse updateEvent (Event event);
    Event getEventById(int id);
}
