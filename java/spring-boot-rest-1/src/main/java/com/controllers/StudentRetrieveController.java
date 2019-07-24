package com.controllers;

import java.util.List;

import com.beans.Student;
import com.beans.StudentRegistration;

import org.springframework.stereotype.Controller;

@Controller
public class StudentRetrieveController {
	
	
	@ResponeBody
	public List<Student> getAllStudents(){
		return StudentRegistration.getInstance().getStudentRecords();
		
	}

}
