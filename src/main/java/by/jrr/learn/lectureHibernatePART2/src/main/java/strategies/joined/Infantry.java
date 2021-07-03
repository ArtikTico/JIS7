package strategies.joined;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@NoArgsConstructor
@Data
public  class Infantry {//Пехота

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private InfantryType infantryType;

    private Integer moveSpeed;

    private Integer durability;

    public Infantry(InfantryType infantryType, Integer moveSpeed, Integer durability) {
        this.infantryType = infantryType;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
    }
}
