package by.jrr.learn.lecture8and9;


import java.sql.Time;

public class App {
    public static void main(String[] args) {
        AnimalInterface animal = new TimeServiceImpl();
        animal.defaultEat();
        var tiger = new Tiger();

    }
}
