package by.jrr.learn.lecture11TDD.service;

import by.jrr.learn.lecture11TDD.model.Student;

import java.util.List;

public interface StudentService {

    Student create (Long id, String name, int age, String workPlace);

    Student update(Student student);

    List<Student> findAllUsers();

    Student findUserByUserId(Long id);

    void deleteUserById(Long id);
}
