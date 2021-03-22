package by.jrr.learn.streamTasks.taskOne;

import java.util.Map;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        var student =  new Student("Artsemi")
                .rate("Math", 5)
                .rate("Geography", 4)
                .rate("Chemyst", 8);

        var student2 = new Student("Ivan")
                .rate("Math", 8)
                .rate("Geography", 6)
                .rate("Chemyst", 3);

        var student3 = new Student("Timophei")
                .rate("Math", 10)
                .rate("Geography", 10)
                .rate("Chemyst", 10);

        var average = Stream.of(student, student2, student3)
                .map(it -> it.rating)
                .flatMap(it -> it.entrySet().stream()
                        .filter(key -> key.getKey().contains("Geography")))
                .mapToInt(Map.Entry::getValue)
                .average();
        average.stream().forEach(System.out::println);


    }
}
