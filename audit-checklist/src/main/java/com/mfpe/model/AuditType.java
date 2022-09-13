package com.mfpe.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
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
