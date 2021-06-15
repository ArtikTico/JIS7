package logging;

import logging.service.UserServiceImpl;

public class App {
    public static void main(String[] args) {
        var userService = new UserServiceImpl();
        var user = userService.createUser("Meliodas", "Lion");
        var user2 = userService.createUser("Robocop", "freeze");
        var user3 = userService.createUser("Luntik", "moon");
        var user4 = userService.createUser("Soolstice", "thisIsYourEnd");

        userService.deleteByUsername("Luntik");

        userService.findAllUsers().forEach(System.out::println);

        System.out.println(userService.findByUserName("Meliodas"));

//        System.out.println(userService.findByUserName("SomeName"));

        userService.createUser("Meliodas", "most powerful");
//        TODO: https://javarush.ru/groups/posts/650-konkurs-osnovih-xml-dlja-java-programmista---chastjh-31-iz-3---sax
//        Скинуть ссылку на Sax парсер xml, DOM парсер старый и медленней чем Sax, не использовать.
    }
}
