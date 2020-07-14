package com.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.beans.Student;
import com.api.beans.StudentRegistration;
import com.api.beans.StudentRegistrationReply;

@Controller
public class StudentRetrieveController {
	
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	@ResponseBody
	public List<Student> getStudent() {
		
		
		System.out.println("In registerStudent");
		List li = new ArrayList();
        //StudentRegistrationReply stdregreply = new StudentRegistrationReply();           
        Student stdregreply = new Student();
        //StudentRegistration.getInstance().add(student);
        

        //We are setting the below value just to reply a message back to the caller
//        stdregreply.setName(student.getName());
//        stdregreply.setAge(student.getAge());
//        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        
        stdregreply.setName("team");
        stdregreply.setAge(15);
        stdregreply.setRegistrationNumber("reg");        
        //stdregreply.setRegistrationStatus("Successful");
        li.add(stdregreply);
        stdregreply = new Student();
        stdregreply.setName("meat");
        stdregreply.setAge(16);
        stdregreply.setRegistrationNumber("reg");        
        //stdregreply.setRegistrationStatus("Successful");
        li.add(stdregreply);
        stdregreply = new Student();
        stdregreply.setName("tamex");
        stdregreply.setAge(17);
        stdregreply.setRegistrationNumber("reg");        
        //stdregreply.setRegistrationStatus("Successful");
        li.add(stdregreply);

		//return StudentRegistration.getInstance().getStudentRecords();
        return li;
	}
	//@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	
	@RequestMapping(value="/return400", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity sendViaResponseEntity() {
	    return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

	//	public String sendViaResponseEntity() {
//	    return "400";
//	}

	
	
}
