package com.demo.aop;

import com.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceProxy implements IUserServiceProxy{
    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<User>();
        User user = new User();
        list.add(user);
        System.out.println("findAll+++++++++");
        return list;
    }

    @Override
    public User findById(Integer id) {
        System.out.println("findById+++++++++");
        return new User();
    }

    @Override
    public User findByName(String name) {
        System.out.println("findByName+++++++++++");
        return new User();
    }

    @Override
    public void countUsers(Integer id) {
        System.out.println("countUsers+++++++++");
    }

    @Override
    public void addUser(User user) {
        System.out.println("addUser++++++++++++");
    }

    @Override
    public void update(User user) {
        System.out.println("update+++++++++");
    }
}
