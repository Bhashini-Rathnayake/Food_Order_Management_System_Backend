package com.example.hotel.service;

import com.example.hotel.model.dto.OrderDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceTest {

    @Autowired
    private OrderService orderService;


    @Test
    void getAllOrder() {
        this.orderService.getAllOrder();
    }

//    @Test
//    void getOrderByID() {
//        this.orderService.getOrderByID(1);
//    }

    @Test
    void saveAndUpdateOrder() {
        OrderDTO orderDTO = new OrderDTO();
//        orderDTO.setOrderId();
//        orderDTO.setOrderDate();
        orderDTO.setInvoiceNumber("AK002");
        orderDTO.setCustomerId(1);
        orderDTO.setProductId(1);
        orderDTO.setQuantity(2);
        orderDTO.getAmount();
        orderDTO.setPaymentMethod("cash");
        orderDTO.setStatus("pending");

        this.orderService.saveAndUpdateOrder(orderDTO);
    }
}

