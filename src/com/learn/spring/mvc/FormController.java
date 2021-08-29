package com.learn.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/formData")
public class FormController {

	@RequestMapping("/showForm")
	String showForm() {
		return "formPage";
	}
	
	@RequestMapping("/submitForm")
	String submitForm(@RequestParam("userName") String name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("username", name);
		
		return "alteredForm";
	}
	
}
