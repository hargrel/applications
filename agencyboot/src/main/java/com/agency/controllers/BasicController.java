package com.agency.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

	@Value("${application.name:Luke}")
	private String name = "Luke";

	@RequestMapping("/basic")
	public String home(Model model) {
		model.addAttribute("name", name);
		return "basic";
	}
	
}
