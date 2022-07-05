package com.medapp.MedApp.dto.bean.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationUserBeanInfo {

    private String mail;
    private String password;
    private String confPass;


}
