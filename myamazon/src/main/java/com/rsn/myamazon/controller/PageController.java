package com.rsn.myamazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "hello", "index" })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("Page");
		modelAndView.addObject("greeting", "Welcome to the Spring web MVC");
		return modelAndView;
	}
}
