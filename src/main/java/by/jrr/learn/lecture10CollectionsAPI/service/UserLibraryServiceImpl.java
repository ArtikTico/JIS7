package by.jrr.learn.lecture10CollectionsAPI.service;

import by.jrr.learn.lecture10CollectionsAPI.entity.User;
import by.jrr.learn.lecture10CollectionsAPI.entity.UserType;
import by.jrr.learn.lecture10CollectionsAPI.repository.MapUserRepository;


import java.util.List;
import java.util.stream.Collectors;

import static by.jrr.learn.lecture10CollectionsAPI.repository.MapUserRepository.*;

public class UserLibraryServiceImpl {

    public void addUserCollectionByUserType(List<User> users) {
        var astronautUser = users.stream()
                .filter(it -> it.getUserType().equals(UserType.ASTRONAUT))
                .collect(Collectors.toList());

        getUserLibrary().put(UserType.ASTRONAUT, astronautUser);

        var teacherUser = users.stream()
                .filter(it -> it.getUserType().equals(UserType.TEACHER))
                .collect(Collectors.toList());

        getUserLibrary().put(UserType.TEACHER, teacherUser);

        var studentUser = users.stream()
                .filter(it -> it.getUserType().equals(UserType.STUDENT))
                .collect(Collectors.toList());

        getUserLibrary().put(UserType.STUDENT, studentUser);

        var militaryUser = users.stream()
                .filter(it -> it.getUserType().equals(UserType.MILITARY))
                .collect(Collectors.toList());

        getUserLibrary().put(UserType.MILITARY, militaryUser);


    }
}
