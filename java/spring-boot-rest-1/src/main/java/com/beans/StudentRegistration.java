package com.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	private List<Student> studentRecords;
	private static StudentRegistration stdregd = null;
	public StudentRegistration(List<Student> studentRecords) {
		super();
		this.studentRecords = studentRecords;
	}
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
		
	}
	public static StudentRegistration getInstance(){
		
		if(stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}else {
		return stdregd;
		}
		
	}
	public void add(Student std) {
		studentRecords.add(std);
	}
	public String updateStudent(Student std) {
		for(int i=0; i < studentRecords.size();i++) {
			
			Student std1= studentRecords.get(i);
	if(std1.getEmail().equals(std.getEmail())) {
	studentRecords.set(i, std);
	return "update successful";
	}
	}
		return "update un-sucessful";	
}
	
    public String deleteStudent(String email) {
    	for(int i = 0; i<studentRecords.size();i++) {
    		
    		Student std1 = studentRecords.get(i);
    		if(std1.getEmail().equals(email));
    		studentRecords.remove(i);
    		return "delete successful";
    		
    	}
		return "delete un-successful";
    	}
	public List<Student> getStudentRecords() {
		return studentRecords;
	}
	public void setStudentRecords(List<Student> studentRecords) {
		this.studentRecords = studentRecords;
	}
    
    
}

