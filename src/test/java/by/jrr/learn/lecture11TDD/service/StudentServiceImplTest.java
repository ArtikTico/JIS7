package by.jrr.learn.lecture11TDD.service;

import by.jrr.learn.lecture11TDD.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

   private StudentServiceImpl userService;

    @BeforeEach
    void setUp() {
        userService = new StudentServiceImpl();
    }

    @Test
    void getStudentWithAgeLessThanZero_checkCreateUser_IllegalArgumentException() {
       assertThrows(IllegalArgumentException.class, this::getStudentWithAgeLessThanZero);

    }

    @Test
    void getFullDefinedUser_checkCreateUser_fullDefinedUser() {
     var createdUser = userService.create(1L,"Ticon", 20, "Leverx");
       assertEquals(getFullDefinedUser(),createdUser, "Expected null but i've got " + createdUser);
 }
    @Test
    public void getUserWithEmptyName_checkCreateUser_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, this::getUserWithEmptyName);
        assertThrows(IllegalArgumentException.class, this::getUserWithSpaceName);
        assertThrows(IllegalArgumentException.class, this::getUserWithNullName);
    }


    public Student getFullDefinedUser() {
       return new Student(1L, "Ticon", 20, "Leverx");
    }

    public Student getStudentWithAgeLessThanZero() {
        return userService.create(1L,"Ticon", - 20, "Leverx");
    }

    public Student getUserWithEmptyName() {
        return userService.create(1L,"", 20, null);
    }

    public Student getUserWithSpaceName() {
        return userService.create(1L," ", 20, null);
    }

    public Student getUserWithNullName() {
        return userService.create(1L,null, 20, null);
    }
}