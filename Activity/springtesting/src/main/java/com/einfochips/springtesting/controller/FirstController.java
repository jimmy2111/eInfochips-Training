package com.einfochips.springtesting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.springtesting.model.Member;

@RestController
public class FirstController {
	@RequestMapping("home")
	public String getHome() {
		return "Hello Home Page";
	}
	@RequestMapping("login")
	public ModelAndView getLoginPage() {
		return new ModelAndView("login");
	}
	@RequestMapping("index")
	public String getIndex() {
		return "Hello Index Page";
	}

}
