package nestedclasses.buldings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Building {
    private String name;
    private int yearOfBuild;
    private String color;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Apartment {
        private int number;
        private int floor;//этаж
        private int numberOfRooms;
    }
}
