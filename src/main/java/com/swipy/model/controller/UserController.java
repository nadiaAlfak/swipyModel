package com.swipy.model.controller;

import com.google.gson.Gson;
import com.swipy.model.businessLogic.UserCRUD;
import com.swipy.model.dto.UserDto;
import com.swipy.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserCRUD userCRUD;
    @Autowired
    public void setUserCRUD(UserCRUD userCRUD) {
        this.userCRUD = userCRUD;
    }

    @PostMapping("/newUser")
    public boolean register(@RequestBody String newUser){
        Gson gson=new Gson();
        UserDto user=gson.fromJson(newUser,UserDto.class);
       return userCRUD.save(user);


    }

    @PostMapping("/updateUser")
    public boolean update(@RequestBody String existUser){
        Gson gson = new Gson();
        UserDto exist_User=gson.fromJson(existUser,UserDto.class);
        return true;
        //todo:password should never be update here.
    }

    @GetMapping("/user")
    public String getUser(@RequestParam String id){
        return null;
    }
}
