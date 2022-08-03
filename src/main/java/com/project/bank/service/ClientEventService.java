package com.project.bank.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.project.bank.events.ClientCreatedEvent;
import com.project.bank.events.Event;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ClientEventService {
	
	@KafkaListener(
			topics = "${topic.client.name:clients}",
			containerFactory = "kafkaListenerContainerFactory",
	groupId = "group")
	public void client(Event<?> event) {
		if (event.getClass().isAssignableFrom(ClientCreatedEvent.class)) {
			ClientCreatedEvent clientCreatedEvent = (ClientCreatedEvent) event;
			log.info("Received Client created event .... with Id={}, data={}",
					clientCreatedEvent.getId(),
					clientCreatedEvent.getData().toString());
		}

	}

}
