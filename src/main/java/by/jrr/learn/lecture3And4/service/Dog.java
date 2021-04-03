package by.jrr.learn.lecture3And4.service;

public class Dog {
    static int counter = 0;

    public int method(int[] array) {
        for (int count: array
             ) {
            counter++;
        }

        System.out.println(counter);
        return counter;
    }
}
