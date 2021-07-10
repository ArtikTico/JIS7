package by.jrr.customer.repository;

import by.jrr.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>, JpaSpecificationExecutor<CustomerEntity> {
    CustomerEntity findByUsername(String username);
    boolean existsByIdAndUsernameLikeAndAddressIsNotNullAndBasketId(Long id, String username, Long basketId);

    @Query(nativeQuery = true, value = "SELECT * FROM customers WHERE firstname = ?")
    CustomerEntity findByName(String name);
}
