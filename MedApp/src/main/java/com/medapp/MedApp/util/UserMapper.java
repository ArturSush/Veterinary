package com.medapp.MedApp.util;

import com.medapp.MedApp.dto.bean.User.UserBean;
import com.medapp.MedApp.dto.bean.User.UserNameBean;
import com.medapp.MedApp.model.User;

import java.util.Objects;

public class UserMapper {

    public static User userBeanToUser(UserBean bean){
        User user = null;
        if(Objects.nonNull(bean)){
            user = new User();
            user.setId(bean.getId());
        }
        return user;
    }

    public static UserNameBean toUserNameBean(User user) {

        return null;
    }

}
