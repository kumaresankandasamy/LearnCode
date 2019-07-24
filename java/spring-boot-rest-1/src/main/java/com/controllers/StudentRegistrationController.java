package com.controllers;

import com.beans.Student;
import com.beans.StudentRegistration;
import com.beans.StudentRegistrationReply;

public class StudentRegistrationController {

	
	private static final String POST = null;
	private static final String value = null;

	

			@ResponseBody
			public StudentRegistrationReply registerStudent(@RequestBody(method = "", value = "") Student student) {
	
	        System.out.println("register student : ");
	        StudentRegistrationReply stdregreply = new StudentRegistrationReply(null, 0, null, null);
	        StudentRegistration.getInstance().add(student);
	        stdregreply.setName(student.getName());
	        stdregreply.setEmail(student.getEmail());
	        stdregreply.setId(student.getId());
	        stdregreply.setRegStatus("successful");
	        
			return stdregreply;
	        
	
	
	}
			public static void main(String[] args) {
				
			}
	}

