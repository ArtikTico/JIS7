package by.jrr.learn.lecture8and9;

public interface TigerInter {
    void eat();

    default void defaultEat() {
        System.out.println("Tiger eat");
    }
}
