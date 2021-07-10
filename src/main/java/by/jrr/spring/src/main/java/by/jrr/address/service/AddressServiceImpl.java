package by.jrr.address.service;

import by.jrr.address.entity.AddressEntity;
import by.jrr.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    @Transactional
    public AddressEntity create(String city, String country, String homeNumber, String street) {
        var address = new AddressEntity();
        address.setCity(city);
        address.setCountry(country);
        address.setHomeNumber(homeNumber);
        address.setStreet(street);
        return addressRepository.save(address);
    }
}
