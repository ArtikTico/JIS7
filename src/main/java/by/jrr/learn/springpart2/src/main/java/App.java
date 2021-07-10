
import by.jrr.customer.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext("by.jrr");
        CustomerService customerService = (CustomerService) ctx.getBean("customerService");
        var artsemi = customerService.createCustomer("Artsemi", "Artic@mail.ru", "Lebedenskogo 130");
    }
}
