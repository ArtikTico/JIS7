package service;

import dbconfig.PostgresConnector;
import user.Status;
import user.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class UserServiceImpl implements UserService {

    @Override
    public User create(String firstName, String lastName, String username, Status status, String email) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();

        String sql = "INSERT INTO \"user\" (first_name, last_name, username, status, email) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, username);
        statement.setString(4, status.name());
        statement.setString(5, email);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new user was inserted successfully!");
        }
        statement.close();
        connection.close();
        return new User (firstName, lastName, username, status, email);
    }

    @Override
    public Collection<User> findAll() throws SQLException, ClassNotFoundException {
        var statement = PostgresConnector.getStatement();

        String sql = "SELECT * FROM \"user\";";
        Collection<User> userList = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString(3));
            user.setUsername(resultSet.getString(4));
            user.setStatus(Status.valueOf(resultSet.getString(5)));
            user.setEmail(resultSet.getString(6));
            userList.add(user);
        }
        resultSet.close();
        statement.close();
        statement.getConnection().close();
        return userList;
    }
}
