package by.jrr.demoapp.creditcard.web.converter;

import by.jrr.demoapp.creditcard.model.CreditCard;
import by.jrr.demoapp.creditcard.web.dto.CreditCardResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class CreditCardWebConverter {

    private final ModelMapper modelMapper;

    public CreditCardResponse toResponse(CreditCard creditCard) {
        var creditCardResponse =  modelMapper.map(creditCard, CreditCardResponse.class);
        if (creditCardResponse.getFounds().compareTo(BigDecimal.ZERO) < 0) {
            creditCardResponse.setHasUserIndebtedness(true);
        }
        return creditCardResponse;
    }
}
