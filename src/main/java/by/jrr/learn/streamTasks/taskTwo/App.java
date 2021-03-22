package by.jrr.learn.streamTasks.taskTwo;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student student = new Student("Artsemiy", 26, "Ticon");
        Student student1 = new Student("Ivan", 20, "Ivanovsk");
        Student student2 = new Student("Kirill", 21, "Kirrilovsk");
        List<Student> students = Arrays.asList(student, student1, student2);
        students.stream().map(it -> new StudentDTO(it.getUsername(), it.getAge())).forEach(System.out::println);
        int a = 5;
        int b = 0;
        System.out.println(a / b);
    }
}
