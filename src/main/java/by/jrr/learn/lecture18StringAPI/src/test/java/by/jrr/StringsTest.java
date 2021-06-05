package by.jrr;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {
    @Test
    public void testStringInitialization() {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);

        s1 += " Artsemi";
        System.out.println(s1);

        System.out.println(s1 == s2);

        StringBuilder greetings = new StringBuilder("Hello");
        StringBuilder farewell = new StringBuilder("goodbye");

        List.of("Hello","GoodBye")
                .stream()
                .filter(it -> it.contains("o"))
                .forEach(System.out::println);


        greetings.append(" Artsemi Heelo One More TiME");
        boolean b = greetings.compareTo(farewell) == 0;
        System.out.println();
        System.out.println(farewell.indexOf("\n"));


    }
}