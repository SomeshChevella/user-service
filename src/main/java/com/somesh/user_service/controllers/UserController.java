package com.somesh.user_service.controllers;

import com.somesh.user_service.models.User;
import com.somesh.user_service.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/add/user")
    public String createUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/get/user")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
