package com.example.hotel.dao;

import com.example.hotel.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
    Order findByOrderId(Integer orderId);

    Order getOrderByOrderId(Integer orderID);

}
