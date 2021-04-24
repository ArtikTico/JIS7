package by.jrr.learn.lecture11TDD.validator;

import by.jrr.learn.lecture11TDD.model.Student;

import java.util.Objects;

public class StudentValidator {

    public void validateStudentAge(Integer age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be equals zero or less");
        }
    }

    public void validateStudentName(String name) {
        if (Objects.isNull(name) || Objects.equals(name, "") || Objects.equals(name, " ")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
}
