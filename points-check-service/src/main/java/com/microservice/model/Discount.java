package com.microservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;

@Entity
public class Discount implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Getter
	public Long id;
	
	@Getter
	public String cpf;
	
	@Getter
	public Integer points;
	
}
