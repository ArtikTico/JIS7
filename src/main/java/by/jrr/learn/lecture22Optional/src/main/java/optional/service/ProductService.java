package optional.service;

import optional.model.Product;

import java.math.BigDecimal;
import java.util.Optional;

public interface ProductService {

    Product findProductById(Integer id);

    Product findProductByName(String name);

    Product createProduct(String name, BigDecimal price, Double discount);
}
