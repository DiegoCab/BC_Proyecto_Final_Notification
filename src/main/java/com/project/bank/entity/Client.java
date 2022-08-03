package com.project.bank.entity;

import lombok.Data;

@Data
public class Client {
	
public String id;
	
	public String name;
	
	public String lastName;
	
    public DocumentType docType;
	
	public String docNumber;
	
	public String mobileNumber;
	
	public String email;

}
