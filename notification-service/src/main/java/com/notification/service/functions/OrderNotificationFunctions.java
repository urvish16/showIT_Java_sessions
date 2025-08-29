package com.notification.service.functions;

import com.notification.service.dto.OrderDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class OrderNotificationFunctions {

    @Bean
    public Function<OrderDetail, String> orderEventReceiver(){
        return (orderDetail -> {
            System.out.println("Sending notification to user ");
            logicSendEmailAndMessageToTheUser(orderDetail.getEmailId(), orderDetail.getUserPhone());
           return "Order notification send to user";
        });
    }

    private void logicSendEmailAndMessageToTheUser(String emailId, String userPhone) {
        System.out.println("sending email to : "+emailId);
        System.out.println("Sending sms to : "+userPhone);
        System.out.println("Notification sent");
        System.out.println("--------------------");
    }
}
