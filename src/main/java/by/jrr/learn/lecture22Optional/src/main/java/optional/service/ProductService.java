package optional.service;

import optional.model.Product;

public interface ProductService {

    Product findProductById(Long id);

    Product findProductByName(String name);
}
