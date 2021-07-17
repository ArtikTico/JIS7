package by.jrr.demoapp.creditcard.spec;

import by.jrr.demoapp.creditcard.dto.CreditCardParam;
import by.jrr.demoapp.creditcard.entity.CreditCardEntity;
import by.jrr.demoapp.creditcard.entity.CreditCardEntity_;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreditCardSpec {

    public static Specification<CreditCardEntity> makeSpec(CreditCardParam creditCardParam) {
        var resultSet = (Specification<CreditCardEntity>) (root, query, builder)
                -> root.get(CreditCardEntity_.ID).isNotNull();

        if (Objects.nonNull(creditCardParam.getBankName())) {
            var bankNameSpec = searchByBankNameFilter(creditCardParam.getBankName());
            resultSet = resultSet.and(bankNameSpec);
        }
        return resultSet;
    }

    private static Specification<CreditCardEntity> searchByBankNameFilter(String bankName) {
        return (Specification<CreditCardEntity>) (root, query, builder) -> builder
                .like(builder.upper(root.get(CreditCardEntity_.BANK_NAME)), ("%" + bankName + "%").toUpperCase());
    }
}
