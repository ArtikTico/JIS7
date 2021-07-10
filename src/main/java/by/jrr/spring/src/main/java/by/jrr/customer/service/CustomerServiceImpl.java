package by.jrr.customer.service;

import by.jrr.address.entity.AddressEntity;
import by.jrr.address.repository.AddressRepository;
import by.jrr.basket.repository.BasketRepository;
import by.jrr.creditcard.repository.CreditCardRepository;
import by.jrr.customer.entity.CustomerEntity;
import by.jrr.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    @Transactional
    public CustomerEntity create(String firstName, String lastname, String username,
            String email, String password, Long addressId,
            Long basketId, Collection<Long> creditCardIds) {
        log.info("Creating customer");

        var customerAddress = addressRepository.findById(addressId)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find address with id " + addressId));
        var customerBasket = basketRepository.findById(basketId)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find basket with id " + basketId));
        var customerCreditCards = creditCardRepository.findAll().stream()
                .filter(creditCardIds::contains)
                .collect(Collectors.toSet());

        var customer = CustomerEntity.builder()
                .firstName(firstName)
                .lastName(lastname)
                .email(email)
                .address(customerAddress)
                .basket(customerBasket)
                .creditCard(customerCreditCards)
                .username(username)
                .password(password)
                .build();

        var savedCustomer =  customerRepository.save(customer);

        log.info("Customer with id " + savedCustomer.getId() + " has been successfully saved!");

        return savedCustomer;
    }

    @Override
    public boolean existCustomer(Long id, String name, Long basketId) {
        return customerRepository.existsByIdAndUsernameLikeAndAddressIsNotNullAndBasketId(id, name, basketId);
    }

    @Override
    public CustomerEntity findByName(String name) {
        return customerRepository.findByName(name);
    }
}
