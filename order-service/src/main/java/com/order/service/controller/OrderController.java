package com.order.service.controller;

import com.order.service.dto.OrderDetail;
import com.order.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<?> createOrder(){
        OrderDetail orderDetail = this.orderService.createOrder();
        orderCreatedNotification(orderDetail);
        return ResponseEntity.ok("Order create");
    }

    @Autowired
    private StreamBridge streamBridge;

    private void orderCreatedNotification(OrderDetail orderDetail) {
        boolean send = streamBridge.send("orderCreateEvent-out-0", orderDetail);
        if (send){
            System.out.println("Order successfully send to notification service");
        }
        else {
            System.out.println("Event fail");
        }

    }
}
