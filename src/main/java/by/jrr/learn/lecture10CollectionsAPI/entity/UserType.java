package by.jrr.learn.lecture10CollectionsAPI.entity;

public enum UserType {
    TEACHER("Учитель"), STUDENT("Студент"), MILITARY("Военный"), ASTRONAUT("Астронавт");

    private final String typeUsers;

     UserType(String usersType) {
        this.typeUsers = usersType;
    }

    public String getTypeUsers() {
        return typeUsers;
    }

}
