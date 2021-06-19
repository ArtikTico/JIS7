package optional;

import optional.model.Product;
import optional.service.ProductService;
import optional.service.ProductServiceImpl;

import java.math.BigDecimal;
import java.util.Optional;

import static optional.repository.ProductLibrary.*;

public class App {
    public static void main(String[] args) {
//        Optional<String> hello = Optional.of("Hello");
//        Optional<String> optonalOfNullable = Optional.ofNullable(null);
//        Optional<String> optionalEmpty = Optional.empty();
//
//        ProductService productService = new ProductServiceImpl();
//
//        Product meat = new Product("Meat", BigDecimal.valueOf(7.66), 30.0);
//        Product sweet = new Product("Sweet", BigDecimal.valueOf(12.01), 0.0);
//        Product milk = new Product("three", BigDecimal.valueOf(0.0), 0.0);
//
//        getProductList().add(meat);
//        getProductList().add(sweet);
//        getProductList().add(milk);
//
//        getProductList().forEach(System.out::println);
//
//        Product milkPr = getProductList().get(2);
//
////        Optional.ofNullable(milkPr.getName()).ifPresentOrElse(name -> milkPr.setName(name.toUpperCase()),
////                () -> milkPr.setName("Artsemi"));
//
//        Integer sizeName = Optional.ofNullable(milkPr.getName()).map(name -> name.length())
//                .orElse(0);
//
//        Product snikers = productService.createProduct("Snikers", BigDecimal.valueOf(10.0), null);
//
//        if (Optional.ofNullable(milkPr.getName()).isPresent()) {
//            milkPr.setName(milkPr.getName().toLowerCase());
//        }
//
//        Optional<String> nameOpt = Optional.ofNullable(milkPr.getName());
//        String name =  nameOpt.isPresent() ? nameOpt.get() : "Empty";
//        System.out.println(snikers);
//
//        Product productById = productService.findProductById(4);
//
//        String s = optonalOfNullable.orElse("");
//        System.out.println(s + " atata");

        var flag = true || false;
        var flag1 = false || true;
        var flag2 = false || false;
        var flag3 = true || true;
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
    }
}
