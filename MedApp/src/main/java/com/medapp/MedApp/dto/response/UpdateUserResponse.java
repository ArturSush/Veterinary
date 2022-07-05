package com.medapp.MedApp.dto.response;

import com.medapp.MedApp.dto.bean.User.UserBean;
import com.medapp.MedApp.model.User;
import com.medapp.MedApp.util.BaseResponse;

public class UpdateUserResponse extends BaseResponse {
    private UserBean updatedUser;

    public UpdateUserResponse(int code, String message, User toUserUpdateResponse) {
        super(code, message, toUserUpdateResponse);
    }
}
