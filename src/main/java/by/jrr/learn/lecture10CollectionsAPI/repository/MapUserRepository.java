package by.jrr.learn.lecture10CollectionsAPI.repository;

import by.jrr.learn.lecture10CollectionsAPI.entity.User;
import by.jrr.learn.lecture10CollectionsAPI.entity.UserType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUserRepository {

    private static final Map<Enum<UserType>, List<User>> userLibrary = new HashMap<>();

    public static Map<Enum<UserType>, List<User>> getUserLibrary() {
        return userLibrary;
    }
}
