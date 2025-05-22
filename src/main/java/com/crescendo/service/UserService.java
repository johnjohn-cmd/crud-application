package com.crescendo.service;

import com.crescendo.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        User u1 = new User();
        u1.setName("Michael");
        u1.setEmail("Michael@gmail.com");
        users.add(u1);
        User u2 = new User();
        u2.setName("carl");
        u2.setEmail("carl@gmail.com");
        users.add(u2);
        return users;

    }
}
