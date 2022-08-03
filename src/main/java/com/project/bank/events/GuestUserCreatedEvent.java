package com.project.bank.events;

import com.project.bank.entity.GuestUser;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GuestUserCreatedEvent extends Event<GuestUser> {

}
