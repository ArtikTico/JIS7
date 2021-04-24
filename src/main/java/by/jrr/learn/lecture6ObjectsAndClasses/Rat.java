package by.jrr.learn.lecture6ObjectsAndClasses;

import java.util.List;
import java.util.Objects;

public class Rat {

    private String name;
    private String lastName;
    private String color;
    private Integer age;
    private List<Turtle> turtles;

    public Rat() {
    }
    public List<Turtle> getTurtles() {
        return turtles;
    }

    public void setTurtles(List<Turtle> turtles) {
        this.turtles = turtles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rat rat = (Rat) o;
        return Objects.equals(name, rat.name) &&
                Objects.equals(lastName, rat.lastName) &&
                Objects.equals(color, rat.color) &&
                Objects.equals(age, rat.age) &&
                Objects.equals(turtles, rat.turtles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, color, age, turtles);
    }

    @Override
    public String toString() {
        return "Rat{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", turtles=" + turtles +
                '}';
    }
}
