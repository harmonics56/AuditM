package com.mfpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfpe.feign.AuditCheckListFeign;
import com.mfpe.feign.AuthorizationFeign;
import com.mfpe.model.AuditQuestion;
import com.mfpe.model.AuthenticationResponse;

	@Service
	public class AuditCheckListService{

		@Autowired
		private AuditCheckListFeign auditcheckClient;
		
//		@Override
		public List<AuditQuestion> getAllQuestions(String jwt) {
			List<AuditQuestion> auditQuestion = auditcheckClient.getAllauditCheckListQuestions(jwt);
//			this.managerName = authenticationResponse.getName();
//			this.projectName = authenticationResponse.getProjectName();
			
			return auditQuestion;
		}
		
		
	}