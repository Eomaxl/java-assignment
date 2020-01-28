package com.mailingservice.mailingservice.kafka.consumer;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;


import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.mailingservice.mailingservice.entity.dto.UserDto;
import com.mailingservice.mailingservice.service.EmailService;

public class Receiver {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private EmailService emailService;

    @KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public void receive(UserDto payload) {
        LOGGER.info("received payload='{}'"+payload);
        emailService.sendSimpleMessage(payload);
        latch.countDown();
    }
}

