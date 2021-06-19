package service;

import dbconfig.PostgresConnector;
import user.Status;
import user.User;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    
    @Override 
    public User create(Long id, String firstName, String lastName, String username, Status status, String email) throws SQLException {
        var statement = PostgresConnector.getStatement();
        
        PostgresConnector.closeStreams(statement, statement.getConnection());
        return new User (id ,firstName, lastName, username, status, email);
    }
}
