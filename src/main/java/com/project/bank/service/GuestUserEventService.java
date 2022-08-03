package com.project.bank.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.project.bank.events.Event;
import com.project.bank.events.GuestUserCreatedEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class GuestUserEventService {
	
	@KafkaListener(
			topics = "${topic.guestuser.name:guestusers}",
			containerFactory = "kafkaListenerContainerFactory",
	groupId = "group")
	public void guestUser(Event<?> event) {
		if (event.getClass().isAssignableFrom(GuestUserCreatedEvent.class)) {
			GuestUserCreatedEvent guestUserCreatedEvent = (GuestUserCreatedEvent) event;
			log.info("Received GuestUser created event .... with data={}",
					guestUserCreatedEvent.getData().toString());
		}

	}

}
