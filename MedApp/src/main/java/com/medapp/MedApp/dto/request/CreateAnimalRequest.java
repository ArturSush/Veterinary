package com.medapp.MedApp.dto.request;

import com.medapp.MedApp.dto.bean.Animal.CreateAnimalBean;

public class CreateAnimalRequest {

    private CreateAnimalBean createAnimalBean;

    public CreateAnimalBean getCreateAnimalBean() {
        return createAnimalBean;
    }

    public void setCreateAnimalBean(CreateAnimalBean createAnimalBean) {
        this.createAnimalBean = createAnimalBean;
    }

    public void CreateAnimalRequest(CreateAnimalBean createAnimalBean) {
        this.createAnimalBean = createAnimalBean;
    }



}
