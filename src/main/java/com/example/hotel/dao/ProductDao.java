package com.example.hotel.dao;

import com.example.hotel.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findByProductId(Integer productID);

    Product getProductByProductId(Integer productID);
}
