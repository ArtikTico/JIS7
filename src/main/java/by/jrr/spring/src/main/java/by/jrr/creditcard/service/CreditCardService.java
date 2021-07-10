package by.jrr.creditcard.service;

import by.jrr.creditcard.entity.CreditCardEntity;

import java.math.BigDecimal;

public interface CreditCardService {

    CreditCardEntity create(String bankName, String cardNumber, BigDecimal founds);
}
