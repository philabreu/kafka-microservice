package com.microservice.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;

@Entity
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Getter
	private Long id;
	
	@Getter
	private String name;
	
	@Getter
	private String cpf;
	
	@Getter
	private String address;
	
	@Getter
	private LocalDateTime birthDate;
	
}
