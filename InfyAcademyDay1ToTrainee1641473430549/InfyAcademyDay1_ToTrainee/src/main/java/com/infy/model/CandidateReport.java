package com.infy.model;
//Follow the class diagram strictly
public class CandidateReport {
	private Integer candidateId;
	private String candidateName;
	private Integer mark1;
	private Integer mark2;
	private Integer mark3;
	private Character result;
	private String grade;
	public CandidateReport(Integer candidateId,String candidateName,Integer mark1,Integer mark2,Integer mark3,Character result,String grade){
		this.candidateId=candidateId;
		this.candidateName=candidateName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.result=result;
		this.grade=grade;
	}
	public Integer getCandidateId() {
		return this.candidateId;
	}
	public String getCandidateName() {
		return this.candidateName;
	}
	public Integer getMark1() {
		return this.mark1;
	}
	public Integer getMark2() {
		return this.mark2;
	}
	public Integer getMark3() {
		return this.mark3;
	}
	public Character getResult() {
		return this.result;
	}
	public String getGrade() {
		return this.grade;
	}
}
