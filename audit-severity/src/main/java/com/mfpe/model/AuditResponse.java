package com.mfpe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@Entity
@Table(name="audit_response")

public class AuditResponse {
	
	@Id
	@GeneratedValue
	private int auditId;
	private String managerName;
	private String projectName;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;
	
	private String projectExecutionStatus;
	private String remedialActionDuration;
	
	
	public AuditResponse() {};
	public AuditResponse(int auditId, String managerName, String projectName, Date creationDateTime,
			String projectExecutionStatus, String remedialActionDuration) {
		super();
		this.auditId = auditId;
		this.managerName = managerName;
		this.projectName = projectName;
		this.creationDateTime = creationDateTime;
		this.projectExecutionStatus = projectExecutionStatus;
		this.remedialActionDuration = remedialActionDuration;
	}


	

	public int getAuditId() {
		return auditId;
	}
	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectExecutionStatus() {
		return projectExecutionStatus;
	}
	public void setProjectExecutionStatus(String projectExecutionStatus) {
		this.projectExecutionStatus = projectExecutionStatus;
	}
	public String getRemedialActionDuration() {
		return remedialActionDuration;
	}
	public void setRemedialActionDuration(String remedialActionDuration) {
		this.remedialActionDuration = remedialActionDuration;
	}
	public Date getCreationDateTime() {
		return creationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime2) {
		this.creationDateTime = creationDateTime2;
	}
	
}
