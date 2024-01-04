package com.example.hotel.dao;

import com.example.hotel.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao  extends JpaRepository<Customer,Integer> {

    Customer findByCustomerId (Integer customerId);

    Customer getCustomerByCustomerId(Integer customerID);
}
