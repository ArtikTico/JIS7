package connections.manyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "child_toy", 
            joinColumns = {@JoinColumn(name = "child_id")}, 
            inverseJoinColumns = {@JoinColumn(name = "toy_id")})
    private Collection<Toy> toys;

    public Child(String name, Collection<Toy> toys) {
        this.name = name;
        this.toys = toys;
    }
}
