package com.mfpe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="audit_benchmark")
public class AuditBenchmark {
	
	@Id
	@Column(name="benchmark_id")
	@GeneratedValue
	private int benchmarkId;
	
	@Column(name="audit_type")
	private String auditType;
	
	@Column(name="benchmark_no_answers")
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
