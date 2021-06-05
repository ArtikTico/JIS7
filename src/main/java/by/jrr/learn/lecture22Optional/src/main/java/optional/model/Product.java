package optional.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Product {
    private Integer id;
    private static Integer countId = 0;
    private String name;
    private BigDecimal price;
    private Double discount;

    public Product(Integer id, String name, BigDecimal price, Double discount) {
        this.id = countId;
        countId++;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
}
