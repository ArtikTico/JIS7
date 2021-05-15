package by.jrr.learn.projectstask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long personId;
    private String name;
    private List<Skill> skill;

    public Person(Long personId, String name, Skill ... skill) {
        this.personId = personId;
        this.name = name;
        this.skill = Arrays.asList(skill);
    }
}
