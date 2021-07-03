package strategies.joined;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Knight extends Infantry {

    private Boolean hasShield;

    public Knight(InfantryType infantryType, Integer moveSpeed, Integer durability, Boolean hasShield) {
        super(infantryType, moveSpeed, durability);
        this.hasShield = hasShield;
    }
}
