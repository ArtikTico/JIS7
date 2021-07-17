package by.jrr.demoapp.creditcard.model;

import by.jrr.demoapp.creditcard.entity.CreditCardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {

    private Long id;

    @NotNull
    @Size(min = CreditCardEntity.MIN_CARD_NUMBER, max = CreditCardEntity.MAX_CARD_NUMBER)
    private String cardNumber;

    @NotNull
    private String bankName;

    @NotNull
    private BigDecimal founds;
}
