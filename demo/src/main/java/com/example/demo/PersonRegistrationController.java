package com.example.demo;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;

@RestController
public class PersonRegistrationController implements PersonRegistration{
	
	public RestTemplate restTemplate = new RestTemplate();

	@Override
	public ResponseEntity<List<PersonDetails>> verifyBeneficiaryBIS(VerifyPersonRequest request) {

		List<PersonDetails> output = null;
		try {
			String url = "https://localhost:8080/provider/getPerson";
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add("content-type", MediaType.APPLICATION_JSON_VALUE);
			HttpEntity<?> httpEntity = new HttpEntity<Object>(request, httpHeaders);
			
			ResponseEntity<List<PersonDetails>> apiResponse = restTemplate.exchange(url, HttpMethod.POST,
					httpEntity, new ParameterizedTypeReference<List<PersonDetails>>() {});
			
			if(apiResponse != null && apiResponse.getStatusCodeValue() == 200) {
				output= apiResponse.getBody();
			}
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<List<PersonDetails>>(output, HttpStatus.OK);
	}

}
