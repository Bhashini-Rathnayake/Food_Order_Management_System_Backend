package com.example.hotel.service;

import com.example.hotel.dao.CustomerDao;
import com.example.hotel.model.Customer;
import com.example.hotel.model.Product;
import com.example.hotel.model.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

   public List<CustomerDTO>getAllCustomer(){
       List<Customer> customers =this.customerDao.findAll();

       List<CustomerDTO> customerDTOS = new ArrayList<>();
       for (Customer customer: customers){
           CustomerDTO customerDTO = new CustomerDTO(customer);

           customerDTOS.add(customerDTO);
       }
       return customerDTOS;
   }

//   public void getCustomerById (Integer cId){
//       Customer customer1 = customerDao.findByCustomerId(cId);
//       System.out.println(customer1);
//   }

    public CustomerDTO getCustomerById(Integer customerID){
       Customer customer = this.customerDao.getCustomerByCustomerId(customerID);
        return new CustomerDTO(customer);
    }

   public CustomerDTO saveAndUpdateCustomer (CustomerDTO customerDTO){
       Customer existingCustomer = null;

       if (customerDTO.getCustomerId()!= null){
           existingCustomer = customerDao.findByCustomerId(customerDTO.getCustomerId());
       } else {
           existingCustomer = new Customer();
       }

       existingCustomer.setCustomerName(customerDTO.getCustomerName());
       existingCustomer.setCustomerAddress(customerDTO.getCustomerAddress());
       existingCustomer.setCustomerTelNo(customerDTO.getCustomerTelNo());

       customerDao.saveAndFlush(existingCustomer);

       CustomerDTO customerDTO1 = new CustomerDTO(existingCustomer);
       return  customerDTO1 ;
   }

    private class customer {
    }
}
