package com.project.bank.events;

import com.project.bank.entity.Client;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ClientCreatedEvent extends Event<Client>{

}
