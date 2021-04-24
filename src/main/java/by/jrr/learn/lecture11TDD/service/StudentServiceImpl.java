package by.jrr.learn.lecture11TDD.service;

import by.jrr.learn.lecture11TDD.model.Student;
import by.jrr.learn.lecture11TDD.validator.StudentValidator;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentValidator validator = new StudentValidator();

    @Override
    public Student create(Long id, String name, int age, String workPlace) {
        validator.validateStudentAge(age);
        validator.validateStudentName(name);
        return new Student(id, name, age, workPlace);
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public List<Student> findAllUsers() {
        return null;
    }

    @Override
    public Student findUserByUserId(Long id) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
