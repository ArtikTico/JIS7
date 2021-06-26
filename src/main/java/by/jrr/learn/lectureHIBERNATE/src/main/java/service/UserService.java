package service;

import entity.User;

import java.util.Collection;

public interface UserService {

    User create (String firstName, String lastName, String username, String email);

    Collection<User> findAll();
}
