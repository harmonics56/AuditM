package com.mfpe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {
	
	@Id
	@GeneratedValue
	@Column(name="question_id")
	private int questionId;
	
	@Column(name="question")
	private String question;
	
	@Column(name="audit_type")
	private String auditType;
	
	@Column(name="response")
	private String response;

	public Question() {};
	public Question(int questionId, String question, String auditType, String response) {
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
	};

	
	
	
	
}
