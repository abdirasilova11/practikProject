package com.company.service.Impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl  implements UserService {
    private UserDao users;

    public UserServiceImpl(UserDao users) {
        this.users = users;
    }

    public UserDao getUsers() {
        return users;
    }

    public void setUsers(UserDao users) {
        this.users = users;
    }

    @Override
    public void addUser(List<User> users, User user) {
        this.add(user);
    }

    private void add(User user) {
    }

    @Override
    public void findId(List<User> users, int id) {
        for (User u: users) {
          if (u.getId() == id){
              System.out.println(u);
          }
        }

    }

    @Override
    public void cleanWithId(List<User> users, int id) {
users.removeIf(user -> user.getId() == id);
    }

    @Override
    public void getAllUsers(List<User> users, Object userDao) {
        System.out.println(userDao);
    }
}
