package com.springbootweb.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springbootweb.di.app.models.service.Service;

@Controller
public class IndexController {
	
	@Autowired
	private Service s;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("service", s.operacion());
		return "index";
	}

}
