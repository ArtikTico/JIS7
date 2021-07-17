package by.jrr.demoapp.creditcard.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardResponse {

    private Long id;
    private String cardNumber;
    private String bankName;
    private BigDecimal founds;
    private boolean hasUserIndebtedness;
}
