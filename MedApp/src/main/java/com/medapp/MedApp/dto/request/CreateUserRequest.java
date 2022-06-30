package com.medapp.MedApp.dto.request;

import com.medapp.MedApp.dto.bean.UserBean;

public class CreateUserRequest {
    private UserBean userToCreate;

    public UserBean getUserToCreate() {
        return userToCreate;
    }

    public void setUserToCreate(UserBean userToCreate) {
        this.userToCreate = userToCreate;
    }
}
