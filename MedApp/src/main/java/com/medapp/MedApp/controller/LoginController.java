package com.medapp.MedApp.controller;


import com.medapp.MedApp.dto.bean.LoginInfo;
import com.medapp.MedApp.dto.bean.User.RegistrationUserBeanInfo;
import com.medapp.MedApp.dto.bean.User.UserBean;
import com.medapp.MedApp.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
        public class Logincontroller {

        @Autowired
        private AnimalService service;


        @GetMapping ("/login")
        public String getLoginFage (Model model) {
        LoginInfo info = new LoginInfo();
        model.addAttribute("info", info);
        return "login";
        }

        @PostMapping("/login")
        public UserBean logIn(LoginInfo info) {
        return service.logIn (info);
        }




            @GetMapping ("/registration")
            public String getRegPage (Model model) {
                RegistrationUserBeanInfo regInfo = new RegistrationUserBeanInfo();
                model.addAttribute("registrationBean", regInfo);
                return "registration";
            }
            @PostMapping("/registration/(email)")
            public UserBean registration(@PathVariable String email) {
                return service.reg (email);
            }
        }

