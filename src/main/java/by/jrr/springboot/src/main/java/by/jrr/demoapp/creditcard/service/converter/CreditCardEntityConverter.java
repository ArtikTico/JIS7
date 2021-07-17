package by.jrr.demoapp.creditcard.service.converter;

import by.jrr.demoapp.creditcard.dto.CreditCardParam;
import by.jrr.demoapp.creditcard.entity.CreditCardEntity;
import by.jrr.demoapp.creditcard.model.CreditCard;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreditCardEntityConverter {

    private final ModelMapper modelMapper;

    public CreditCard toModel(CreditCardParam creditCardParam) {
        return modelMapper.map(creditCardParam, CreditCard.class);
    }

    public CreditCardEntity toEntity(CreditCard creditCard) {
        return modelMapper.map(creditCard, CreditCardEntity.class);
    }

    public CreditCard fromEntityToModel(CreditCardEntity creditCardEntity) {
        return modelMapper.map(creditCardEntity, CreditCard.class);
    }
}
