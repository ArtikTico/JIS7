package by.jrr.learn.projectstask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    private String name;
    private int knownPercentage;
}
