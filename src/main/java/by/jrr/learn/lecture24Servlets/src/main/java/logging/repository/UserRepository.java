package logging.repository;

import logging.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }
}
