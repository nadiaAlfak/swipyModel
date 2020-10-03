package com.swipy.model.controller;

import com.google.gson.Gson;
import com.swipy.model.businessLogic.UserCRUD;
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
        User user=gson.fromJson(newUser,User.class);
        return true;

    }
    @PostMapping("/updateUser")
    public boolean update(@RequestBody String existUser){
        Gson gson = new Gson();
        User exist_User=gson.fromJson(existUser,User.class);
        return true;
        //todo:password should never be update here.

    }
    @GetMapping("/user")
    public String getUser(@RequestParam String id){
        return null;
    }


}
