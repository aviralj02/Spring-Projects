package ncu.SpringWebDemo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ncu.entity.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping(value = "/register")
	public String showRegistration() {
		return "register";
	}
	
	@RequestMapping(value = "/display")
	public String displayForm(@Valid @ModelAttribute("user") User user, BindingResult br) {
		if (br.hasErrors()) {
			return "register";
		}
		else {
			return "display";
		}
	}
}
