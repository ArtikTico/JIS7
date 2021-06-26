import service.UserServiceImpl;

public class Application {
    public static void main(String[] args) {
        var userService = new UserServiceImpl();
        var userEntity = userService.create("Alex", "Alexandr", "Alex", "Alex@mail.ru");
        System.out.println(userEntity);

        userService.findAll().forEach(System.out::println);
    }
}
