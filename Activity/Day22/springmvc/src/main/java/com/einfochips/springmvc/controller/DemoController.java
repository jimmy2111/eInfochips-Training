package com.einfochips.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.springmvc.jdbc.UserJdbc;
import com.einfochips.springmvc.model.User;

@RestController
public class DemoController {
	@Autowired
	UserJdbc uj;
	
	@RequestMapping("home")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("register")
	public ModelAndView getRegister() {
		return new ModelAndView("reg");
	}
	
	@RequestMapping("checkUser")
	public ModelAndView checkUser(@RequestParam("uname") String name, @RequestParam String passwd) {
		
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("name", name);
		mv.addObject("passwd",passwd);
		List<User> u = uj.getAllUsers();
		System.out.println(u);
		System.out.println(name);
		System.out.println(passwd);
		
		return mv;
	}
	@GetMapping("users")
	public List<User> getAllUsers(){
		List<User> li = uj.getAllUsers();
		return li;
	}
}
