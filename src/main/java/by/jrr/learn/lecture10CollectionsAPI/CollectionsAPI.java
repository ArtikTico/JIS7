package by.jrr.learn.lecture10CollectionsAPI;


import by.jrr.learn.lecture10CollectionsAPI.entity.User;
import by.jrr.learn.lecture10CollectionsAPI.entity.UserType;
import by.jrr.learn.lecture10CollectionsAPI.service.UserLibraryServiceImpl;
import by.jrr.learn.lecture10CollectionsAPI.service.UserListServiceImpl;
import by.jrr.learn.lecture10CollectionsAPI.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static by.jrr.learn.lecture10CollectionsAPI.repository.DatabaseUserRepository.getUserList;
import static by.jrr.learn.lecture10CollectionsAPI.repository.MapUserRepository.getUserLibrary;

public class CollectionsAPI {
    public static void main(String[] args) {
        UserService userService = new UserListServiceImpl();
        userService.createAndAddInDatabase("Alex", 26, UserType.TEACHER);
        userService.createAndAddInDatabase("Alex MAckevich", 26, UserType.TEACHER);

        userService.createAndAddInDatabase("Timon", 26, UserType.ASTRONAUT);
        userService.createAndAddInDatabase("Pumba", 20, UserType.ASTRONAUT);

        userService.createAndAddInDatabase("Katya", 20, UserType.STUDENT);
        userService.createAndAddInDatabase("Maxim", 30, UserType.STUDENT);

        userService.createAndAddInDatabase("Artsemi", 30, UserType.MILITARY);
        userService.createAndAddInDatabase("Capitan", 30, UserType.MILITARY);

        User user = new User("Tim", 1, UserType.TEACHER);
        User user1 = new User("Tim", 1, UserType.TEACHER);
        List<User> lists = new ArrayList<>();
        lists.add(user);
        lists.add(user1);
        UserLibraryServiceImpl userLibraryService = new UserLibraryServiceImpl();
        userLibraryService.addUserCollectionByUserType(getUserList());

        for (Map.Entry<Enum<UserType>, List<User>> set:getUserLibrary().entrySet()
             ) {
            System.out.println("Key: " + set.getKey() + " value: " + set.getValue());
        }
        getUserLibrary().put(UserType.MILITARY, lists);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (Map.Entry<Enum<UserType>, List<User>> set:getUserLibrary().entrySet()
        ) {
            System.out.println("Key: " + set.getKey() + " value: " + set.getValue());
        }

        
    }
}
