package ncu.SpringWebDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputFormHandler {
	@RequestMapping(value = "/input")
	public String getInputForm() {
		return "input-form";
	}
	
	@RequestMapping(value = "/process")
	public String processInputForm(@RequestParam("userName") String name,@RequestParam("userPass") String pass ,Model model) {
		String upper = "Mr. "+name.toUpperCase();
		String newPass = "****"+pass+"*****";
		
		model.addAttribute("upper", upper);
		model.addAttribute("newPass", newPass);
		return "process-form";
	}
}
