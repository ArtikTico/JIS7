package by.jrr.customer.entity;

import by.jrr.address.entity.AddressEntity;
import by.jrr.basket.entity.BasketEntity;
import by.jrr.creditcard.entity.CreditCardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customers")
@Builder
@AllArgsConstructor
@ToString(exclude = {"address", "creditCard", "basket"})
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "customer_id", unique = true)
    private Collection<CreditCardEntity> creditCard;

    @OneToOne
    @JoinColumn(name = "basket_id")
    private BasketEntity basket;
}
