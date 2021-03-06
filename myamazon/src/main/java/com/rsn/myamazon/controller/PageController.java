package com.rsn.myamazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rsn.myamazonback.dao.CategoryDAO;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDao;

	@RequestMapping(value = { "home" })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("Page");
		// to set the title of the page
		modelAndView.addObject("title", "Home");
		modelAndView.addObject("categories",categoryDao.list());
		// this is used when we user click home
		// this value is used in page.jsp along with the if condition.
		modelAndView.addObject("userClickHome", true);
		return modelAndView;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("Page");
		modelAndView.addObject("title", "About Us");
		modelAndView.addObject("userClickAbout", true);
		return modelAndView;
	}

	@RequestMapping(value = { "contact" })
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("Page");
		modelAndView.addObject("title", "Contact Us");
		modelAndView.addObject("userClickContact", true);
		return modelAndView;
	}
}
