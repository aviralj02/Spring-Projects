package ncu.StudentSpring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Student;

@Controller
public class FormController {
	
	@ModelAttribute("student")
	public Student getStudent() {
		return new Student();
	}
	
	@RequestMapping(value = "/form")
	public String getStudentForm() {
		return "student-form";
	}
	
	@RequestMapping(value = "/display")
	public String displayForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "student-form";
		}
		else {
			return "display";
		}
	}
}
