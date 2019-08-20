package com.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HellowWorldController {
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
}
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormVersionTow")
	public String lestShut(HttpServletRequest request ,Model model) {
		String theName =request.getParameter("stdName");
		theName=theName.toUpperCase();
		String result="Yo! "+theName;
		model.addAttribute("message",result);
		return "helloworld";
	}
	@RequestMapping("/processFormVersionThree")
	public String lestShutThree(@RequestParam("stdName") String theName,Model model) {
		theName=theName.toUpperCase();
		String result="hi bro version three "+theName;
		model.addAttribute("message",result);
		return "helloworld";
	}

}
