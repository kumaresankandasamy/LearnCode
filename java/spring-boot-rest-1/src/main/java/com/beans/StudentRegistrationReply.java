package com.beans;

public class StudentRegistrationReply {

	String name;
	int id;
	String email;
	String regStatus;
	public StudentRegistrationReply(String name, int id, String email, String regStatus) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.regStatus = regStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegStatus() {
		return regStatus;
	}
	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}
	
}
