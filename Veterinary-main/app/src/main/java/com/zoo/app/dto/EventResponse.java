package com.zoo.app.dto;

import com.zoo.app.model.Event;

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
