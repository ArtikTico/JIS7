package by.jrr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext("by.jrr");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
