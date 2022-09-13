package com.mfpe.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AuditType {
	
	private String auditType;

	public AuditType() {};
	public AuditType(String auditType) {
		super();
		this.auditType = auditType;
	}
	public String getAuditType() {
		return auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	
	
}
