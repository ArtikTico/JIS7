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
@Entity
@EqualsAndHashCode(callSuper = true)
public class FrostSpell extends Spell {

    private Boolean hasFrozen;

    public FrostSpell(Integer castDuration, Integer damage, Boolean hasFrozen) {
        super(castDuration, damage);
        this.hasFrozen = hasFrozen;
    }
}
