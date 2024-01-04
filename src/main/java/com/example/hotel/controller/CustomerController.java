package com.example.hotel.controller;

import com.example.hotel.model.dto.CustomerDTO;
import com.example.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/get-all-customer",method = RequestMethod.GET)
    public ResponseEntity <List<CustomerDTO>> getAllCustomer(){
        List<CustomerDTO> customers = this.customerService.getAllCustomer();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @RequestMapping(value = "/getCustomerByID/{customerId}",method = RequestMethod.GET)
    public ResponseEntity<CustomerDTO> getCustomerByID(@PathVariable Integer customerId){
        CustomerDTO customer = this.customerService.getCustomerById(customerId);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }

    @RequestMapping(value = "/save-and-update-customer", method = RequestMethod.POST)
    public ResponseEntity<CustomerDTO> saveAndUpdateCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO newOrder = this.customerService.saveAndUpdateCustomer(customerDTO);

        return new ResponseEntity<>(newOrder,HttpStatus.CREATED);
    }

}
