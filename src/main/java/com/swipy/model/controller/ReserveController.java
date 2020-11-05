package com.swipy.model.controller;

import com.google.gson.Gson;
import com.swipy.model.businessLogic.ReserveCRUD;
import com.swipy.model.dto.ReserveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReserveController {

    ReserveCRUD reserveCRUD;
    @Autowired
    public void setReserveCRUD(ReserveCRUD reserveCRUD) {
        this.reserveCRUD = reserveCRUD;
    }
    @PostMapping("/newReserve")
    public boolean register (@RequestBody String newReserve){
        Gson gson=new Gson();
        ReserveDto reserveDto=gson.fromJson(newReserve,ReserveDto.class);
        return ReserveCRUD.Save(reserveDto);
    }


}
