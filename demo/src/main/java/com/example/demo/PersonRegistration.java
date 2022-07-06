package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.security.*;

@Validated
public interface PersonRegistration {

	@Operation(summary = "", description = "This API helps to verify a person.", security = {
			@SecurityRequirement(name = "bearer_auth") }, tags = { "Verification API" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PersonDetails.class)))) })
	@RequestMapping(value = "/verifyperson", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
	ResponseEntity<List<PersonDetails>> verifyBeneficiaryBIS(@RequestBody VerifyPersonRequest request);
}
