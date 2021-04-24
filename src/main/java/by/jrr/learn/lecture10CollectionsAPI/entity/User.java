package by.jrr.learn.lecture10CollectionsAPI.entity;

import java.util.Objects;

public class User {

    private Long id;
    private static Long idCounter = 0L;
    private String name;
    private int age;
    private UserType userType;

    public User(String name, int age, UserType userType) {
        this.id = idCounter += 1;
        this.name = name;
        this.age = age;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                userType == user.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, userType);
    }

    @Override
    public String toString() {
        return "User{" + "id = '" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", userType=" + userType +
                '}';
    }
}
