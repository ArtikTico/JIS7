package lambdas.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private List<Skill> skills;

    public User(String name, Integer age, Skill... skill) {
        this.name = name;
        this.age = age;
        this.skills = Arrays.asList(skill);
    }
}
