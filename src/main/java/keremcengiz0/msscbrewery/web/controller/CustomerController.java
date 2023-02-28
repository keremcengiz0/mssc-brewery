package keremcengiz0.msscbrewery.web.controller;

import keremcengiz0.msscbrewery.services.CustomerService;
import keremcengiz0.msscbrewery.web.model.BeerDto;
import keremcengiz0.msscbrewery.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable(name = "customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }


}
