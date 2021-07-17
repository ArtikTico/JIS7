package by.jrr.demoapp.creditcard.web.controller;

import by.jrr.demoapp.creditcard.dto.CreditCardParam;
import by.jrr.demoapp.creditcard.service.CreditCardService;
import by.jrr.demoapp.creditcard.web.converter.CreditCardWebConverter;
import by.jrr.demoapp.creditcard.web.dto.CreditCardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/credit-cards")
@Validated
@RequiredArgsConstructor
public class CreditCardController {

    private final CreditCardService creditCardService;
    private final CreditCardWebConverter creditCardWebConverter;

    @PostMapping
    @NotNull
    public CreditCardResponse create (@Valid @NotNull @RequestBody CreditCardParam creditCardParam) {
        var creditCard = creditCardService.create(creditCardParam);
        return creditCardWebConverter.toResponse(creditCard);

    }


    @NotNull
    @GetMapping
    public Collection<CreditCardResponse> findAll() {
        return creditCardService.findAll().stream()
                .map(creditCardWebConverter::toResponse)
                .collect(Collectors.toSet());
    }

    @NotNull
    @GetMapping("/{creditCadId}")
    public CreditCardResponse findById(@Valid @NotNull @PathVariable (name = "creditCadId") Long creditCadId) {
        var creditCard =  creditCardService.findById(creditCadId);
        return creditCardWebConverter.toResponse(creditCard);
    }

    @GetMapping("/byName")
    public Collection<CreditCardResponse> findByName(@Valid @NotNull @RequestBody CreditCardParam creditCardParam) {
        var creditCard = creditCardService.findByName(creditCardParam);
        return creditCard.stream().map(creditCardWebConverter::toResponse).collect(Collectors.toList());
    }
}
