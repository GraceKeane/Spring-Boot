package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.models.Course;

@Controller
@SessionAttributes("course")
public class CourseController {

	@RequestMapping(value = "/addCourse.html", method=RequestMethod.GET)
	public String addCourseGET(Model model) {
		Course c = new Course();
		model.addAttribute("course", c);
	  
		return "addCourse";
	}
	
	@RequestMapping(value = "/addCourse.html", method=RequestMethod.POST)
	public String addCoursePOST(@ModelAttribute("course") Course c) {
		return "redirect:addStudent.html";
  }
}