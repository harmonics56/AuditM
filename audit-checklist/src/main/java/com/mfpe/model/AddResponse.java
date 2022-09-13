package com.mfpe.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class AddResponse {
//	private int questionId;
	private String response;

	public AddResponse() {}

//	public int getQuestionId() {
//		return questionId;
//	}
//
//	public void setQuestionId(int questionId) {
//		this.questionId = questionId;
//	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	};
	
	
	
}

