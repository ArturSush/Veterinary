package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Event;

public class EventResponse {
    private Event event;
    private String info;

    public EventResponse() {
    }

    public EventResponse(Event event, String info) {
        this.event = event;
        this.info = info;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
