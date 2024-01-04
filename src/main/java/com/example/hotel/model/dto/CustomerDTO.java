package com.example.hotel.model.dto;

import com.example.hotel.model.Customer;

public class CustomerDTO {
    private Integer customerId;

    private String customerName;

    private String customerAddress;

    private Integer customerTelNo;

    public CustomerDTO() {
    }

    public CustomerDTO(Customer customer ) {
        this.customerId = customer.getCustomerId();
        this.customerName = customer.getCustomerName();
        this.customerAddress = customer.getCustomerAddress();
        this.customerTelNo = customer.getCustomerTelNo();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getCustomerTelNo() {
        return customerTelNo;
    }

    public void setCustomerTelNo(Integer customerTelNo) {
        this.customerTelNo = customerTelNo;
    }
}
