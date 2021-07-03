package strategies.classPerTable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class FireSpell extends Spell {

    private Integer burningDuration;

    public FireSpell(Integer castDuration, Integer damage, Integer burningDuration) {
        super(castDuration, damage);
        this.burningDuration = burningDuration;
    }
}
