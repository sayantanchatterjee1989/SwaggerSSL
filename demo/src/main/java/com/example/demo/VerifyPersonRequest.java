package com.example.demo;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
public class VerifyPersonRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7938696820541049088L;
	@JsonProperty("id")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
