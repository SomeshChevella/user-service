package com.somesh.user_service.services;

import com.somesh.user_service.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    static int id=0;
    List<User> users= new ArrayList<>();

    public UserService() {
        users.add(new User(++id, "Somesh", "Chevella", "som@mail.com", "India"));
    }

    public List<User> getUsers() {
        return users;
    }

    public String save(User user) {
        user.setUserId(++id);
        users.add(user);
        return user.toString();
    }
}
