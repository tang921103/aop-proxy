package com.demo.aop;

import com.demo.entities.User;

import java.util.List;

public interface IUserServiceProxy {
    List<User> findAll();
    User findById(Integer id);
    User findByName(String name);
    void countUsers(Integer id);
    void addUser(User user);
    void update(User user);
}
