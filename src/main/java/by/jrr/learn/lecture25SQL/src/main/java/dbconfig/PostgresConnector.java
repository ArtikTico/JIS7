package dbconfig;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@AllArgsConstructor
public class PostgresConnector {
    public static final String USERNAME = "postgres";
    public static final String PASS = "2827649";
    public static final String URL = "jdbc:postgresql://localhost:5432/jis7db";

    static Connection connection;

    public static Connection getConnection() throws SQLException {
        connection =  DriverManager.getConnection(URL, USERNAME, PASS);
        return connection;
    }
    public static Statement getStatement() throws SQLException {
        return connection.createStatement();
    }
    
    public static void closeStreams(Statement statement, Connection connection) throws SQLException {
        statement.close();
        connection.close();
    }
}
