import service.UserService;
import service.UserServiceImpl;
import user.Status;

import java.sql.SQLException;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.create(1L, "Art", "Stankevich", "Ticon", Status.VIP, "artzandr@mail.ru");
        String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, "bill");
//        statement.setString(2, "secretpass");
//        statement.setString(3, "Bill Gates");
//        statement.setString(4, "bill.gates@microsoft.com");
//
//        int rowsInserted = statement.executeUpdate();
//        if (rowsInserted > 0) {
//            System.out.println("A new user was inserted successfully!");
//        }
    }
}
