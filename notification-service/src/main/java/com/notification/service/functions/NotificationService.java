package com.notification.service.functions;

   import com.notification.service.dto.OrderInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class NotificationService {

    @Bean
    public Supplier<String> testing(){

        return () -> "This is testing";
    }

    @Bean
    public Function<String, String> sayHello(){

        return (message) -> "Hello how are you? "+message;
    }

    @Bean
    public Function<OrderInfo, String> orderNotification(){

        return orderInformation -> {
            System.out.println("Notification send....");
            sendNotification(orderInformation);
            System.out.println(orderInformation.getEmailId());
            System.out.println(orderInformation.getPrice());
            System.out.println(orderInformation.getUserPhone());
            System.out.println(orderInformation.getCreatedDate());
            return orderInformation.getOrderId();
        };
    }

    private void sendNotification(OrderInfo orderInfo) {

    }
}
