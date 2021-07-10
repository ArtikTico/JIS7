package by.jrr.address.service;

import by.jrr.address.entity.AddressEntity;

public interface AddressService {

    AddressEntity create(String city, String country, String homeNumber, String street);
}
