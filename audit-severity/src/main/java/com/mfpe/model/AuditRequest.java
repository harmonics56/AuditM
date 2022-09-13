package com.mfpe.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data

public class AuditRequest {
	
	private String projectName;
	private String managerName;
	private AuditDetail auditDetail;
	
	public AuditRequest() {};
	
	public AuditRequest(String projectName, String managerName, AuditDetail auditDetail) {
		super();
		this.projectName = projectName;
		this.managerName = managerName;
		this.auditDetail = auditDetail;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public AuditDetail getAuditDetail() {
		return auditDetail;
	}

	public void setAuditDetail(AuditDetail auditDetail) {
		this.auditDetail = auditDetail;
	}
	
	
	
	
}
