package com.mfpe.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data

public class AuditQuestion {
	
	private int questionId;
	private String question;
	private String auditType;
	private String response;
	
	public AuditQuestion() {};
	
	public AuditQuestion(int questionId, String question, String auditType, String response) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.auditType = auditType;
		this.response = response;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
	
}
