package by.jrr.learn.lecture10CollectionsAPI;

import by.jrr.learn.lecture10CollectionsAPI.entity.UserType;
import by.jrr.learn.lecture10CollectionsAPI.service.UserService;
import by.jrr.learn.lecture10CollectionsAPI.service.UserListServiceImpl;
import static by.jrr.learn.lecture10CollectionsAPI.repository.MapUserRepository.getUserLibrary;

public class CollectionApp {
    public static void main(String[] args) {

        UserService userService = new UserListServiceImpl();
        userService.createAndAddInDatabase("Artsemi", 26, UserType.TEACHER);
        userService.createAndAddInDatabase("Alex", 29, UserType.STUDENT);
    }
}
