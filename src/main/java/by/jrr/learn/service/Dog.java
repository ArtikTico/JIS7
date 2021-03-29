package by.jrr.learn.service;

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
