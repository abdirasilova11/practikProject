package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {
    void addUser(List<User> users, User user);
    void findId(List<User> users, int id);
    void cleanWithId(List<User> users, int id);
    void getAllUsers(List<User> users, Object userDao);


}
