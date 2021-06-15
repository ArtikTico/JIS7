package entity.service;

import entity.model.User;

import java.util.List;

public interface UserService {

    User createUser(String userName, String password);

    List<User> findAllUsers();

    User findByUserName(String userName);

    void deleteByUsername(String username);
}
