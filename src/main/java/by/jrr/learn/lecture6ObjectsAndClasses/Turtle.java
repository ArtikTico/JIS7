package by.jrr.learn.lecture6ObjectsAndClasses;

import java.util.Objects;

public class Turtle {
    private String name;
    private String lastName;
    private Integer age;
    private String panzerType;

   public Turtle() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPanzerType() {
        return panzerType;
    }

    public void setPanzerType(String panzerType) {
        this.panzerType = panzerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turtle turtle = (Turtle) o;
        return Objects.equals(name, turtle.name) &&
                Objects.equals(lastName, turtle.lastName) &&
                Objects.equals(age, turtle.age) &&
                Objects.equals(panzerType, turtle.panzerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, panzerType);
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", panzerType='" + panzerType + '\'' +
                '}';
    }
}
