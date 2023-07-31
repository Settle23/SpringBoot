package com.example.SpringBoot.dao;


import com.example.SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> usersList();
    User getUser(long id);
    void adduser(User user);
    void delete(long id);
    void update(User user);
}
