package jrr.stream;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
public class Lecturer {
    private Long id;
    private String name;
    private int age;
    private Collection<Room> rooms;

    public Lecturer(String name, int age, Collection<Room> rooms) {
        this.name = name;
        this.age = age;
        this.rooms = rooms;
    }
}
