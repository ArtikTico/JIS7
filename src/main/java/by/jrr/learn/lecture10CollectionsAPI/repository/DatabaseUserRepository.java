package by.jrr.learn.lecture10CollectionsAPI.repository;

import by.jrr.learn.lecture10CollectionsAPI.entity.User;

import java.util.ArrayList;

public class DatabaseUserRepository  {
    private static final ArrayList<User> userList = new ArrayList<>();

    public static ArrayList<User> getUserList() {
        return userList;
    }


}
