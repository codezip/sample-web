package com.example.sampleweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.example.sampleweb.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/")
	public String hello(Model model) {
		String hello =  helloService.hello();
		model.addAttribute("hello", hello);
		return "index";
	}

	@RequestMapping("/player")
	public String player(Model model) {
		return "player";
	}
}
