package by.jrr.learn.lecture2;


import java.util.Arrays;
import java.util.Random;

public class HomeWorkArraysPartTwo {
    private static int[] arrayInt = new int[5];
    private static int count = 0;
    static private int[] arrayInitializer(int number) {
        arrayInt[count] = number;
        count++;

        if (count == arrayInt.length) {
            int size = arrayInt.length + (arrayInt.length / 2);

            int[] newArray = createNewArray(size);

            for (int j = 0; j < arrayInt.length; j++) {
                newArray[j] = arrayInt[j];
            }

            arrayInt = newArray;
            return arrayInt;
        }
        return arrayInt;
    }

    private static int[] createNewArray(int size) {
        return new int[size];
    }


    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arrayInitializer(random.nextInt(100));
        }
        System.out.println(Arrays.toString(arrayInt));
    }

}
