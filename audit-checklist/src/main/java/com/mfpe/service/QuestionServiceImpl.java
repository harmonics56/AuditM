package com.mfpe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfpe.model.AddResponse;
import com.mfpe.model.AuditType;
import com.mfpe.model.Question;
import com.mfpe.repository.QuestionRepo;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepo questionRepo;
	
	// Service for the Endpoint /AuditCheckListQuestions
	public List<Question> getQuestionsByAuditType(AuditType auditType){
		List<Question> qlist = questionRepo.getQuestionsByAuditType(auditType.getAuditType());
		return qlist;
	}
	
	public List<Question> getAllQuestions(){
		List<Question> qlist = questionRepo.findAll();
		return qlist;
	}
	
	public Question updateQuestionResponse(int questionId, String response){
		
		Question question= questionRepo.getQuestionByQuestionId(questionId);
		question.setResponse(response);
		questionRepo.save(question);
		return question;
	}

}
