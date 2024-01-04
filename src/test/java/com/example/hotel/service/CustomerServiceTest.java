package com.example.hotel.service;

import com.example.hotel.model.Customer;
import com.example.hotel.model.dto.CustomerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;
    private CustomerDTO customerDTO;

//    @Test
//    void getAllCustomer() {
//        this.customerService.getAllCustomer();
//    }

    @Test
    void getCustomerById() {
        customerService.getCustomerById(2);
    }

    @Test
    void saveAndUpdateCustomer() {
        CustomerDTO customers = new CustomerDTO();
        customers.setCustomerName("Malathi Hansika");
        customers.setCustomerAddress("Matara");
        customers.setCustomerTelNo(764763289);

        customerService.saveAndUpdateCustomer(customers);
    }
}