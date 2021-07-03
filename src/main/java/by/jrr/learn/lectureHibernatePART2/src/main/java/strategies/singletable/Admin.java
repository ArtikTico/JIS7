package strategies.singletable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Admin extends User {

    private Boolean hasFullAccess;

    public Admin(String username, Boolean hasFullAccess) {
        super(username);
        this.hasFullAccess = hasFullAccess;
    }
}
