package com.medapp.MedApp.dto.response;

import com.medapp.MedApp.dto.bean.UserBean;
import com.medapp.MedApp.util.BaseResponse;

import java.io.Serializable;

public class CreateUserResponse extends BaseResponse implements Serializable {
    private UserBean createdUser;

    public CreateUserResponse(int i, String s, UserBean toUserCreateRespose) {

    }
}
