package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.Impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    private static UserDao UserDao;

    public static void main(String[] args)  {

        List<User> users = (Arrays.asList(new User(1,"Mavliuda", 19, "female"),
        new User(2, "Aziza", 30, "female"),
                new User(3,"Kanat",23,"male")));

        users.stream().forEach(user -> System.out.println(user));
        System.out.println();
        UserDao userDao = new UserDao(users);
        UserServiceImpl userService = new UserServiceImpl(UserDao);
        userService.findId(users,1);
        System.out.println();
        userService.cleanWithId(users,2);
        System.out.println(users);


    }
}
