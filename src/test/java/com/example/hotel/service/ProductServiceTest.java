package com.example.hotel.service;

import com.example.hotel.model.dto.ProductDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;
    private ProductDTO productDTO;

//    @Test
//    void getAllProduct() {
//        this.productService.getAllProduct();
//    }

//    @Test
//    void getProductByID() {
//        productService.getProductByID(1);
//    }

    @Test
    void saveAndUpdateProduct() {
        ProductDTO products = new ProductDTO();
        products.setProductName("Kottu");
        products.setPrice(450);

        productService.saveAndUpdateProduct(products);
    }
}