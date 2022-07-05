package com.medapp.MedApp.dto.response;

import com.medapp.MedApp.dto.bean.Animal.CreateAnimalBean;
import com.medapp.MedApp.util.BaseResponse;

public class CreateAnimalResponse extends BaseResponse {

    private CreateAnimalBean animalBean;
    public CreateAnimalResponse(Integer code, String message, CreateAnimalBean animalBean) {
        super(code, message);
        this.animalBean = animalBean;
    }

    public CreateAnimalResponse(Integer code, String message) {
        super(code, message);
    }


}
