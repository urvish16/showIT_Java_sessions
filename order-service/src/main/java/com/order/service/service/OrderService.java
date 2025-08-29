package com.order.service.service;

import com.order.service.dto.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public OrderDetail createOrder(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(UUID.randomUUID().toString());
        orderDetail.setEmailId("masnishSharma@gmail.com");
        orderDetail.setUserPhone("9865748596");
        orderDetail.setUserId("526321656");

        return orderDetail;
    }
}
