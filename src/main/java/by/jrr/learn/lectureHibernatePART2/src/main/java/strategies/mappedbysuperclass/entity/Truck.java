package strategies.mappedbysuperclass.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Truck extends Vehicle {

    private Integer maxLoad;
    private Boolean sleeperCab;

    public Truck(String name, Integer seats, Integer maxLoad, Boolean sleeperCab) {
        super(name, seats);
        this.maxLoad = maxLoad;
        this.sleeperCab = sleeperCab;
    }
}
