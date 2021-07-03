package strategies.singletable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Lecturer extends User {

    private Integer studentCount;

    public Lecturer(String username, Integer studentCount) {
        super(username);
        this.studentCount = studentCount;
    }
}
