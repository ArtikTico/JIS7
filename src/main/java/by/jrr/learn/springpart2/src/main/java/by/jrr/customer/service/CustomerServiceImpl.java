package by.jrr.customer.service;

import by.jrr.customer.entity.CustomerEntity;
import by.jrr.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public CustomerEntity createCustomer(String name, String email, String address) {
        var customer = new CustomerEntity();

        customer.setName(name);
        customer.setAddress(address);
        customer.setEmail(email);
        return customerRepository.save(customer);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<CustomerEntity> listAll() {
        return customerRepository.findAll();
    }
}
