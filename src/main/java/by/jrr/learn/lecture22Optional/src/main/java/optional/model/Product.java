package optional.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Product {
    private Integer id;
    private static Integer countId = 0;
    private String name;

    private BigDecimal price;

    @NotNull
    private Double discount;

    public Product(String name, BigDecimal price, Double discount) {
        this.id = countId;
        countId++;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
}
