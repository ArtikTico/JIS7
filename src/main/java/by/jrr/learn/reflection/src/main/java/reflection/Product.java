package reflection;


public class Product {

    private Product () {
    }
    private String privateName;
    private double privatePrice;

    public String name;
    public double price;

    public void printGreet() {
        System.out.println("Hello");
    }
    public void printInfoProduct(String name, double price) {
        System.out.println(name + " " + price);
    }

    private void printGreetPrivate() {
        System.out.println("Hello");
    }
    private void printInfoProductPrivate(String privateName, double privatePrice) {
        System.out.println(privateName + " " + privatePrice);
    }
    private void printInfoProductPrivate(String privateName) {
        System.out.println(privateName + " ");
    }
}
