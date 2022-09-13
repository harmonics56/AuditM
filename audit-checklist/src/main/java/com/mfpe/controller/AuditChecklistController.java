package com.mfpe.controller;

import java.util.ArrayList;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.model.AddResponse;
import com.mfpe.model.AuditType;
import com.mfpe.model.Question;
import com.mfpe.service.AuthorizationService;
import com.mfpe.service.QuestionService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/checklist")
@CrossOrigin(origins = "*")
public class AuditChecklistController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AuthorizationService authorizationService;
	
	Logger logger = LoggerFactory.getLogger("Checklist-Controller-Logger");
	
	// Endpoint for retrieving the questions from the DB 
	@RequestMapping(value = "/AuditCheckListQuestions", method = {RequestMethod.GET, RequestMethod.POST} )
	public List<Question> auditCheckListQuestions(@RequestHeader("Authorization") String jwt, @RequestBody AuditType auditType) {
		List<Question> questions = new ArrayList<Question>();
		
		logger.info("from header JWT :: " + jwt);
		
		// checking if the jwt is valid or not
		if(jwt.length()>0 && authorizationService.validateJwt(jwt)) {	
			questions = questionService.getQuestionsByAuditType(auditType);
		}
		else {
			logger.error("Failed to validate the JWT :: " + jwt);
		}
		return questions;
	}
	
	@RequestMapping(value = "/GetAllQuestions", method = {RequestMethod.GET, RequestMethod.POST} )
	public List<Question> getAllQuestions(@RequestHeader("Authorization") String jwt) {
		List<Question> questions = new ArrayList<Question>();
		
		logger.info("from header JWT :: " + jwt);
		
		// checking if the jwt is valid or not
		if(jwt.length()>0 && authorizationService.validateJwt(jwt)) {	
			questions = questionService.getAllQuestions();
		}
		else {
			logger.error("Failed to validate the JWT :: " + jwt);
		}
		return questions;
	}
	
	@RequestMapping(value = "/addResponse/{questionId}/{response}", method = {RequestMethod.GET, RequestMethod.POST} )
	public Question updateQuestionResponse(@RequestHeader("Authorization") String jwt, 
//			@RequestBody AddResponse addResponse,
			@ApiParam(name = "Question id", value = "Id of Question") @PathVariable int questionId,
			@ApiParam(name = "Response for Question", value = "response for question") @PathVariable String response) {
		
		Question question = new Question();
		
		logger.info("from header JWT :: " + jwt);
		
		// checking if the jwt is valid or not
		if(jwt.length()>0 && authorizationService.validateJwt(jwt)) {	
			 question= questionService.updateQuestionResponse(questionId,response);
//			return new ResponseEntity<String>("Updated Successfully "+question,HttpStatus.OK);;
		}
		else {
			logger.error("Failed to validate the JWT :: " + jwt);
		}
		return question;
	}
	
	
	// Endpoint to check if the microservice is active
	@GetMapping("/health-check")
	public String healthCheck() {
		return "Audit Checklist Microservice is Active";
	}
}
