package com.einfochips.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.User;
import com.einfochips.jdbc.UserDAO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JspController {
	
	@RequestMapping("index")
	public String homePage() {
		return "index.jsp";
	}
	
	@RequestMapping("register")
	public String registerPage() {
		return "registration.jsp";
	}
	
//	@RequestMapping("adddata")
//	public String registerAdd(HttpServletRequest req) {
//		System.out.println(req.getParameter("uname"));
//		System.out.println(req.getParameter("email"));
//		System.out.println(req.getParameter("passwd"));
//		System.out.println(req.getParameter("mobile"));
//		return req.getParameter("uname");
//	}
	
	@RequestMapping("adddata")
	public ModelAndView registerAdd(HttpServletRequest req) throws Exception {
		ModelAndView mv = new ModelAndView("success.jsp");
		String name = req.getParameter("uname");
		String email = req.getParameter("email");
		String password = req.getParameter("passwd");
		String mobile = req.getParameter("mobile");
		if(name.length()>=1 && email.length() >=1 && password.length()>=1 && mobile.length()>=1){
		User u1 = new User(name,email,password,mobile);
		UserDAO ud1 = new UserDAO();
		ud1.insertUser(u1);
		
		mv.addObject("value1", "Data inserted succesfully");
		}
		else {
			mv.addObject("value1", "You have entered less than one character in any one of the field.");
		}
		
		return mv;

	}
	
	@RequestMapping("login")
	public ModelAndView addLogin() {
		return new ModelAndView("loginpage.jsp");
	}
	
	

}
