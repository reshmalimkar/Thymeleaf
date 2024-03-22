package com.ajspire.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajspire.model.Login;

@Controller
public class MyController {
	@RequestMapping("/test")
	public String test(@ModelAttribute Login login , Model model) {
		model.addAttribute("login", login);
//		model.addAttribute("name", login.getName());
//		model.addAttribute("pass", login.getPassword());
		return "home";
	}

}
