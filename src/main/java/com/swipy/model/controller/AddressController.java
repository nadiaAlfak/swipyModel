package com.swipy.model.controller;

import com.google.gson.Gson;
import com.swipy.model.businessLogic.AddressCRUD;
import com.swipy.model.dto.AddressDto;
import com.swipy.model.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    AddressCRUD addressCRUD;
    @Autowired
    public void setAddressCRUD(AddressCRUD addressCRUD) {
        this.addressCRUD  = addressCRUD;
    }

    @PostMapping("/newAddress")
    public boolean register(@RequestBody String newAddress){
        Gson gson=new Gson();
        AddressDto addressDto =gson.fromJson(newAddress,AddressDto.class);
        return addressCRUD.save(addressDto);


    }

    @PostMapping("/updateAddress")
    public boolean update(@RequestBody String existUser){
        Gson gson = new Gson();
        AddressDto exist_Address=gson.fromJson(existUser,AddressDto.class);
        return true;
        //todo:password should never be update here.
    }

    @GetMapping("/Address")
    public String getUser(@RequestParam String id){
        return null;
    }
}

