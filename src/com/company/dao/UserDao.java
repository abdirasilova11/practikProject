package com.company.dao;

import com.company.model.User;

import java.util.List;
import java.util.Objects;

public class UserDao {
   private static List<User> users;

    public UserDao() {
    }

    public UserDao(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
    if (o == null || getClass() != o.getClass()) return false;
    UserDao userDao = (UserDao) o;
    return Objects.equals(users, UserDao.users);
    }

    @Override
    public int hashCode(){
        return Objects.hash(users);
    }

    @Override
    public String toString(){
        return " users: " + users;
    }


}
