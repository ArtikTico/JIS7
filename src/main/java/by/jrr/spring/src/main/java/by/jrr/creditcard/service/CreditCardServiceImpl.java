package by.jrr.creditcard.service;

import by.jrr.creditcard.entity.CreditCardEntity;
import by.jrr.creditcard.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    @Transactional
    public CreditCardEntity create(String bankName, String cardNumber, BigDecimal founds) {
        var creditCard = new CreditCardEntity();
        creditCard.setBankName(bankName);
        creditCard.setCardNumber(cardNumber);
        creditCard.setFounds(founds);
        return creditCardRepository.save(creditCard);
    }
}
