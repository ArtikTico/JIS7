package nestedclasses.bestpractisebuilding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Building {
    private String name;
    private int yearOfBuild;
    private String color;
    private Collection<Apartment> apartments;

    public boolean isColorPresent() {
        if (color.isBlank()) {
            return false;
        }
        return true;
    }
}
