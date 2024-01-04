package com.example.hotel.model.dto;

import com.example.hotel.model.Order;

public class OrderDTO {

    private Integer orderId;

    private String invoiceNumber;

    private String orderDate;

    private Integer customerId;

    private String customerName;

    private Integer productId;

    private String productCode;

    private Integer quantity;

    private double amount;

    private String paymentMethod;

    private String status;

    public OrderDTO() {
    }

    public OrderDTO(Order order) {
        this.orderId = order.getOrderId();
        this.invoiceNumber=order.getInvoiceNumber();
        this.orderDate = order.getOrderDate();
        if (order.getCustomer()!= null){
            this.customerId = order.getCustomer().getCustomerId();
            this.customerName=order.getCustomer().getCustomerName();
        }
        if (order.getProduct()!=null){
            this.productId = order.getProduct().getProductId();
            this.productCode= order.getProduct().getProductCode();
        }
        this.quantity = order.getQuantity();
        this.amount = order.getAmount();
        this.paymentMethod = order.getPaymentMethod();
        this.status=order.getStatus();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
