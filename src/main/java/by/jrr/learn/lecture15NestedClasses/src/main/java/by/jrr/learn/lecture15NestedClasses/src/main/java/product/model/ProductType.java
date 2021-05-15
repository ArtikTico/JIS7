package product.model;

public enum ProductType {

    MEAT("МЯСО"),
    VEGETABLES("ОВОЩИ") ,
    POTATOES("КАРТОХА"),
    SWEETS("СЛАДОСТИ");

    private final String description;

    ProductType(String description) {
        this.description = description;
    }
}
