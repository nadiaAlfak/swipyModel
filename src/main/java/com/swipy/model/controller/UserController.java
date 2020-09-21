package com.swipy.model.controller;

import com.google.gson.Gson;
import com.swipy.model.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/newUser")
    public void register(@RequestBody String newUser){
        Gson gson=new Gson();
        User user=gson.fromJson(newUser,User.class);

    }

}
