package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Validated
public interface PersonApi {

	@Operation(summary = "", description = "This API helps to return a person details.", security = {
			@SecurityRequirement(name = "bearer_auth") }, tags = { "Person API" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PersonDetails.class)))) })
	@RequestMapping(value = "/getPerson", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
	ResponseEntity<List<PersonDetails>> verifyPerson(@RequestBody VerifyPersonRequest request);
}
