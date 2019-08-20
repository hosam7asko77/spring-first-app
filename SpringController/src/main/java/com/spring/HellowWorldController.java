package com.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellowWorldController {
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
}
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormVersionTwo")
	public String lestShut(HttpServletRequest request,Model model) {
		
		String theName =request.getParameter("stdName");
		theName=theName.toUpperCase();
		String result="Yo! "+theName;
		model.addAttribute("message",result);
		return "helloworld";
	}
}
