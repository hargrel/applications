package com.agency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecureController {

	@RequestMapping("/basic/success")
	public String basic(Model model) {
		return "basic/success";
	}
	
	@RequestMapping("/standard/success")
	public String standard(Model model) {
		return "standard/success";
	}
	
	@RequestMapping("/restricted/success")
	public String restricted(Model model) {
		return "restricted/success";
	}
	
}
