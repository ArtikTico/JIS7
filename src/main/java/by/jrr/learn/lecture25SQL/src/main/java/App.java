import service.UserService;
import service.UserServiceImpl;
import user.Status;
import user.User;

import java.sql.SQLException;
import java.util.Collection;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        User user = userService.create("Art", "Stankevich", "Ticon", Status.VIP, "artzandr@mail.ru");
        System.out.println(user.toString());

        Collection<User> all = userService.findAll();
        all.forEach(System.out::println);
    }
}
