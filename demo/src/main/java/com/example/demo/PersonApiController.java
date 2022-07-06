package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonApiController implements PersonApi{

	@Override
	public ResponseEntity<List<PersonDetails>> verifyPerson(VerifyPersonRequest request) {
		PersonDetails person = new PersonDetails();
		person.setName("Sayantan");
		person.setId("1234");
		person.setGender("Male");
		
		
		List<PersonDetails> list = new ArrayList<>();
		list.add(person);
		
		return new ResponseEntity<List<PersonDetails>>(list, HttpStatus.OK);
	}

	
}
