package com.example.hotel.model;

import javax.persistence.*;

@Entity

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "customer_telephone_number")
    private Integer customerTelNo;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, String customerAddress, Integer customerTelNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerTelNo = customerTelNo;
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
