package strategies.mappedbysuperclass.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Tank extends Vehicle {

    private Integer firePower;

    public Tank(String name, Integer seats, Integer firePower) {
        super(name, seats);
        this.firePower = firePower;
    }
}
