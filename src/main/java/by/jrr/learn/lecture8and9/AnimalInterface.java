package by.jrr.learn.lecture8and9;

public interface AnimalInterface {
    void eat();

    default void defaultEat() {
        System.out.println("Animal eat");
    }
}
