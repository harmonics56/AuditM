package com.mfpe.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data

public class AuditBenchmark {
	
	private int benchmarkId;
	private String auditType;
	private int benchmarkNoAnswers;
	
	
	
	public AuditBenchmark() {};

	public AuditBenchmark(int benchmarkId, String auditType, int benchmarkNoAnswers) {
		super();
		this.benchmarkId = benchmarkId;
		this.auditType = auditType;
		this.benchmarkNoAnswers = benchmarkNoAnswers;
	}

	public int getBenchmarkId() {
		return benchmarkId;
	}

	public void setBenchmarkId(int benchmarkId) {
		this.benchmarkId = benchmarkId;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public int getBenchmarkNoAnswers() {
		return benchmarkNoAnswers;
	}

	public void setBenchmarkNoAnswers(int benchmarkNoAnswers) {
		this.benchmarkNoAnswers = benchmarkNoAnswers;
	}
	
	
	
}
