package by.jrr.learn.lecture10CollectionsAPI.service;

import by.jrr.learn.lecture10CollectionsAPI.entity.User;
import by.jrr.learn.lecture10CollectionsAPI.entity.UserType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static by.jrr.learn.lecture10CollectionsAPI.repository.DatabaseUserRepository.*;

public class UserListServiceImpl implements UserService {

    @Override
    public User createAndAddInDatabase(String name, int age, UserType userType) {
        User user = new User(name, age, userType);
        getUserList().add(user);
        return user;
    }

    @Override
    public Collection<User> findAllUsers(Collection<User> colection) {
        return colection;
    }

    @Override
    public ArrayList<User> findAllUsersByType(UserType userType) {
        return getUserList().stream()
                .filter(it -> it.getUserType().equals(userType))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public void delete(User user) {
        getUserList().remove(user);
    }

    @Override
    public void deleteById(Long id) {
        getUserList().removeIf(user -> user.getId().equals(id));
    }
}
