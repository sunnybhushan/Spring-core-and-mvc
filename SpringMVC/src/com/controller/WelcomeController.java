package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	
	@RequestMapping("/welcome.do")
	public ModelAndView  welcome()
	{
		System.out.println("called");
		return new ModelAndView("form.jsp");
	}
	
}




