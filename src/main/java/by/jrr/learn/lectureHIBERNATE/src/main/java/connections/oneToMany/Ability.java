package connections.oneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@Entity

public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String abilityName;

    private Integer power;
    @ManyToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;

    public Ability(String abilityName, Integer power, Hero hero) {
        this.abilityName = abilityName;
        this.power = power;
        this.hero = hero;
    }
}
