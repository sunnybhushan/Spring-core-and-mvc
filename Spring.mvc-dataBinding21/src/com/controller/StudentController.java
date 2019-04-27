package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Student;

@Controller
public class StudentController {

	@RequestMapping("/login")
	ModelAndView login(@RequestParam(name = "studentName") String name,
			@RequestParam(name = "password") String password, ModelMap model)
	{
		System.out.println("login called");
		System.out.println(name);
		System.out.println(password);
		
		
		// will send data to the page called
		model.addAttribute("userName", name);
		model.addAttribute("pwd", password);
		return new ModelAndView("data.jsp");
		
	}

	ModelAndView login11(String name, String password) 
	{
		System.out.println(name);
		System.out.println(password);
		return new ModelAndView("data.jsp");
	}
	

	@RequestMapping(value="/studentDetails", method= RequestMethod.POST)
	 String studentDeyaits (@ModelAttribute Student student, BindingResult result)
	{
		
		//if data has error this condition is true
		if(result.hasErrors())
		{
			return ("AddStudent");
		}
		
		System.out.println(student);

		return ("StudentDetails");
	}
	
@RequestMapping(value="/")
String studentDeyaits()
{
return "First";	
}
	

}











