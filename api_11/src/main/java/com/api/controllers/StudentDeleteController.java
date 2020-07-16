package com.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.beans.StudentRegistration;

import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentDeleteController {
	
	//@RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/student")
	@ResponseBody
	public ResponseEntity sendViaResponseEntity() {
    return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}	
//	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {		
//		System.out.println("In deleteStudentRecord");	   
//	    return StudentRegistration.getInstance().deleteStudent(regdNum);		
//	}	

}
