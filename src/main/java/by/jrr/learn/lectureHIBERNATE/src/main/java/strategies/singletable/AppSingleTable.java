package strategies.singletable;

import strategies.singletable.service.UserService;
import strategies.singletable.service.UserServiceImpl;

public class AppSingleTable {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUser("Artik");
        userService.createAdmin("Lukashenko", false);
        userService.createLecturer("Artsemi", 12);
    }
}
