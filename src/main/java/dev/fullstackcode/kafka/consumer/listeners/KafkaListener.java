package dev.fullstackcode.kafka.consumer.listeners;

import dev.fullstackcode.kafka.consumer.dto.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.stereotype.Component;


@Component
public class KafkaListener {




    @org.springframework.kafka.annotation.KafkaListener(groupId ="groups", topics = "${cloudkarafka.topic}" )
    public void listen(Employee data) {
        System.out.println(data);

    }
}
