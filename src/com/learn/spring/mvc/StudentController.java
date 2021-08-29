package com.learn.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.spring.mvc.bean.Student;

@Controller
@RequestMapping("/studentForm")
public class StudentController {
	
	@RequestMapping("/showForm")
	String showStudentForm(Model theModel) {
		
		theModel.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	String processStudentForm(@ModelAttribute("student") Student student) {
		
		System.out.println("Student Name: "+ student.getFirstName());
		return "processed-form";
	}

}
