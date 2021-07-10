package by.jrr;

import by.jrr.address.service.AddressService;
import by.jrr.basket.service.BasketService;
import by.jrr.creditcard.service.CreditCardService;
import by.jrr.customer.entity.CustomerEntity;
import by.jrr.customer.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext("by.jrr");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        var creditCardServiceImpl = (CreditCardService) ctx.getBean("creditCardServiceImpl");
        var addressServiceImpl = (AddressService) ctx.getBean("addressServiceImpl");
        var basketServiceImpl = (BasketService) ctx.getBean("basketServiceImpl");
        var customerServiceImpl = (CustomerService) ctx.getBean("customerServiceImpl");

        var belinvestCard = creditCardServiceImpl
                .create("BelinvestBank", "4344 8511 6421 1234",
                        new BigDecimal("2100.00"));
        var alfaBank = creditCardServiceImpl
                .create("AlfaBank", "4344 8511 6421 3421",
                        new BigDecimal("1000.10"));

        var address =
                addressServiceImpl.create("Minsk", "Belarus", "130", "Bratiev Rait");

        var basket = basketServiceImpl.create();
        CustomerEntity customerEntity = customerServiceImpl.create("Artsemi", "Stankevich", "Ticon", "art@gmail.com",
                "1111", 1L, 1L, List.of(1L, 2L));

        boolean isExist = customerServiceImpl.existCustomer(1L, "Ticon", 1L);
        System.out.println(isExist);

        var artsemi = customerServiceImpl.findByName("Artsemi");
        System.out.println(artsemi);
    }
}
