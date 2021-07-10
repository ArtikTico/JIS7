package connections.manyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@ToString(exclude = "childs")
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @ManyToMany(mappedBy = "toys", fetch = FetchType.EAGER)
    private Collection<Child> childs;

    public Toy(String name) {
        this.name = name;
    }
}
