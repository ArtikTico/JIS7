package strategies.joined;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Archer extends Infantry {

    private Integer range;

    public Archer(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer range) {
        super(infantryType, moveSpeed, durability);
        this.range = range;
    }
}
