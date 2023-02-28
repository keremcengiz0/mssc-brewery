package keremcengiz0.msscbrewery.services;

import keremcengiz0.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
