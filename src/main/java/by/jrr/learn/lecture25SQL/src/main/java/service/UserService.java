package service;

import user.Status;
import user.User;

import java.sql.SQLException;

public interface UserService {
    
    User create(Long id, String firstName, String lastName, String username, Status status, String email) throws SQLException;
}
