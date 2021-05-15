package nestedclasses.bestpractisebuilding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Apartment {
    private int number;
    private int floor;  //этаж
    private int numberOfRooms;
}
