package by.jrr.learn.lecture5Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderCustom {

    Integer a = 0;

    static int division(int a, int b) {
        if (b == 0) {
           throw  new IllegalArgumentException("cannot be zero");
        }
        return a / b;
    }

    static void inputValue() throws IOException {

        try (Scanner scanner = new Scanner(System.in);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String input = bufferedReader.readLine();

            int parseValue = Integer.parseInt(input);
            if (parseValue > 0) {
                System.out.println("Greater than zero");
                System.exit(0);
            } else if (Integer.parseInt(input) < 0) {
                System.out.println("Less than zero");
                System.exit(0);

            } else {
                System.out.println("ZERO!");
                System.exit(0);
            }

        } catch (NumberFormatException e) {
            System.out.println("Cannot be a text please Enter a number!!!: ");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        inputValue();
    }
}
