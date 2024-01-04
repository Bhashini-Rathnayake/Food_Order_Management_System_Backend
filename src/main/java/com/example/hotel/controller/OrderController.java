package com.example.hotel.controller;

import com.example.hotel.model.dto.OrderDTO;
import com.example.hotel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/get-all-order", method = RequestMethod.GET)
    public ResponseEntity<List<OrderDTO>> getAllOrder(){
        List<OrderDTO> orders = this.orderService.getAllOrder();

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @RequestMapping(value = "/getOrderByID/{orderId}", method = RequestMethod.GET)
    public ResponseEntity<OrderDTO> getOrderByID(@PathVariable Integer orderId){
        OrderDTO order = this.orderService.getOrderById(orderId);

        return new ResponseEntity<>(order,HttpStatus.OK);
    }

    @RequestMapping(value = "/save-and-update-order", method = RequestMethod.POST)
    public ResponseEntity<OrderDTO> saveAndUpdateOrder(@RequestBody OrderDTO orderDTO){
        OrderDTO newOrder = this.orderService.saveAndUpdateOrder(orderDTO);

        return new ResponseEntity<>(newOrder,HttpStatus.CREATED);
    }

}
