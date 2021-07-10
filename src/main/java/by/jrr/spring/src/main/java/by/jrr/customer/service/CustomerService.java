package by.jrr.customer.service;

import by.jrr.customer.entity.CustomerEntity;

import java.util.Collection;

public interface CustomerService {

    CustomerEntity create(String firstName, String lastname, String username, String email,
            String password, Long addressId, Long basketId, Collection<Long> creditCardIds);

    boolean existCustomer(Long id, String name, Long basketId);

    CustomerEntity findByName(String name);
}
