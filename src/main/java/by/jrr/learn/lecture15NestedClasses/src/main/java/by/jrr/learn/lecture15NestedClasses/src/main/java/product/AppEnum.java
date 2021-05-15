package product;

import product.service.ProductService;

import static product.model.ProductType.*;

public class AppEnum {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.createProduct(1L, "Chichen", 8.99, MEAT);
    }
}

