package by.jrr.learn.lecture8and9;

import java.util.Objects;

public abstract class Animal {

    private String head;

    private String name;

    private String weight;

    private Integer age;

    private String body;

    private boolean isEating;

    public Animal() {
    }

    public Animal(String head, String name, String weight, Integer age, String body, boolean isEating) {
        this.head = head;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.body = body;
        this.isEating = isEating;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean eating) {
        isEating = eating;
    }


    public abstract void superRoar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isEating == animal.isEating &&
                Objects.equals(head, animal.head) &&
                Objects.equals(name, animal.name) &&
                Objects.equals(weight, animal.weight) &&
                Objects.equals(age, animal.age) &&
                Objects.equals(body, animal.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, name, weight, age, body, isEating);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "head='" + head + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", age=" + age +
                ", body='" + body + '\'' +
                ", isEating=" + isEating +
                '}';
    }
}
