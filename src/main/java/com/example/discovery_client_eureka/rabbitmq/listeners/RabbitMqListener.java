package com.example.discovery_client_eureka.rabbitmq.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqListener {

    @RabbitListener(queues = "${app.queue-name}")
    public void consumeMessage(String msg) {
        System.out.println("Consumed message from RabbitMq Listener :" + msg);
    }

}
