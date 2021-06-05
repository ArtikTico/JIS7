package optional.repository;

import optional.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductLibrary {

    private static final List<Product> productList = new ArrayList<>();

    public static List<Product> getProductList() {
        return productList;
    }


}
