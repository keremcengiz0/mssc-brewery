package keremcengiz0.msscbrewery.web.mappers;

import keremcengiz0.msscbrewery.domain.Customer;
import keremcengiz0.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
