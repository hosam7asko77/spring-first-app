package com.spring;

import org.springframework.stereotype.Controller;
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
}
