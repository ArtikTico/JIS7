package by.jrr.learn.lecture10CollectionsAPI.service;

import by.jrr.learn.lecture10CollectionsAPI.entity.User;
import by.jrr.learn.lecture10CollectionsAPI.entity.UserType;

import java.util.ArrayList;
import java.util.Collection;

public interface UserService {

    User createAndAddInDatabase(String name, int age, UserType userType);

    Collection<User> findAllUsers(Collection<User> collection);

    ArrayList<User> findAllUsersByType(UserType userType);

    void delete(User user);

    void deleteById(Long id);
}
