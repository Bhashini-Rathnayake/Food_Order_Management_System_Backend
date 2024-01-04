package com.example.hotel.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name="product_name")
    private String productName;

    @Column(name= "price")
    private Integer price;

    @Column(name = "product_code")
    private String productCode;

    public Product() {
    }

    public Product(Integer productId, String productName, Integer price, String productCode) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productCode=productCode;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
