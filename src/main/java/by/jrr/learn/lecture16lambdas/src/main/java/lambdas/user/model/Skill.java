package lambdas.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private String nameOfSkill; // имя скила
    private int percentOfPossession; //процент владения
}
