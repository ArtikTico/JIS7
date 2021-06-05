package optional.service;

import optional.model.Product;
import optional.repository.ProductLibrary;

import java.math.BigDecimal;
import java.util.Optional;

import static optional.repository.ProductLibrary.*;

public class ProductServiceImpl implements ProductService {

    @Override
    public Product findProductById(Integer id) {
        return getProductList().stream().filter(it -> it.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException(String.format("Product with id %s could not bee found", id)));
    }

    @Override
    public Product findProductByName(String name) {
        return null;
    }

    @Override
    public Product createProduct(String name, BigDecimal price, Double discount) {
        return new Product(name, price, discount);
    }
}
