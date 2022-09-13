package com.mfpe.service;

import java.util.List;

import com.mfpe.model.AddResponse;
import com.mfpe.model.AuditType;
import com.mfpe.model.Question;

public interface QuestionService {

	public List<Question> getQuestionsByAuditType(AuditType auditType);
	public List<Question> getAllQuestions();
	public Question updateQuestionResponse(int questionId,String response); 
}
