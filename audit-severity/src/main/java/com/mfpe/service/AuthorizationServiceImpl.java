package com.mfpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfpe.feign.AuthorizationFeign;
import com.mfpe.model.AuthenticationResponse;

@Service
public class AuthorizationServiceImpl implements AuthorizationService{

	@Autowired
	private AuthorizationFeign authClient;
	public String managerName;
	public String projectName;
	
	@Override
	public boolean validateJwt(String jwt) {
		AuthenticationResponse authenticationResponse = authClient.validate(jwt).getBody();
		this.managerName = authenticationResponse.getName();
		this.projectName = authenticationResponse.getProjectName();
		
		return authenticationResponse.isValid();
	}
	
	
}
