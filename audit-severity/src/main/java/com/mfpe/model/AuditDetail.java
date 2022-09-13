package com.mfpe.model;

import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component

public class AuditDetail {
	
	private String auditType;
	private Date auditDate;
	private List<AuditQuestion> auditQuestions;
	
	public AuditDetail() {};
	public AuditDetail(String auditType, Date auditDate, List<AuditQuestion> auditQuestions) {
		super();
		this.auditType = auditType;
		this.auditDate = auditDate;
		this.auditQuestions = auditQuestions;
	}
	public String getAuditType() {
		return auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public List<AuditQuestion> getAuditQuestions() {
		return auditQuestions;
	}
	public void setAuditQuestions(List<AuditQuestion> auditQuestions) {
		this.auditQuestions = auditQuestions;
	}
	
	
	
}
