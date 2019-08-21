package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentContrller {
	@RequestMapping("/showForm")
	public String Showform(Model themodel) {
		//create new student object
		Student theStudent=new Student();
		//add student object to the model
		themodel.addAttribute("student",theStudent);
		return "student-form";
}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student theStudent) {
		System.out.println("theStudent: "+theStudent.getFirstName() +""+ theStudent.getLastName() +""+ theStudent.getCountryOption());
		return "student-confirm";
}
}
