package org.kyleyap;

import lombok.extern.slf4j.Slf4j;
import org.kyleyap.event.OrderPlacedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import javax.management.Notification;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(OrderPlacedEvent orderPlacedEvent) {
        // Send out email notification
        log.info("Received Notification OrderPlacedEvent: {}", orderPlacedEvent.getOrderNumber());
    }
}