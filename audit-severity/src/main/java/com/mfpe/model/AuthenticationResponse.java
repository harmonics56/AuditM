package com.mfpe.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Component
public class AuthenticationResponse {
	private String name;
	private String projectName;
	private boolean isValid;
	
	public AuthenticationResponse() {};
	
	public AuthenticationResponse(String name, String projectName, boolean isValid) {
		super();
		this.name = name;
		this.projectName = projectName;
		this.isValid = isValid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
	
}
