package com.example.demo;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
public class PersonDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4903512533793102987L;

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("gender")
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
