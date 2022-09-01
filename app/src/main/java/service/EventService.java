package service;

import dto.EventResponse;
import model.Event;
import org.springframework.stereotype.Service;

@Service
public interface EventService {
    Event createEvent ();
    EventResponse updateEvent (Event event);
    Event getEventById(int id);
}
