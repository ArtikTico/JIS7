package product.service;

import product.model.Product;
import product.model.ProductType;

public class ProductService {

    public Product createProduct(Long id, String name, Double cost, ProductType productType) {
        return new Product(id, name, cost, productType);
    }
}
