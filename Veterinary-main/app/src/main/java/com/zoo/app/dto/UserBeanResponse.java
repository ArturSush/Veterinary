package com.zoo.app.dto;

import com.zoo.app.model.User;

public class UserBeanResponse {
    private User user;
    private String message;


    public UserBeanResponse() {
    }

    public UserBeanResponse(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
