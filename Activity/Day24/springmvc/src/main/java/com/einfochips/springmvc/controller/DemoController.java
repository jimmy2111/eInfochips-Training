package com.einfochips.springmvc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.springmvc.model.Movies;
import com.einfochips.springmvc.movierepository.MovieRepository;




@RestController
public class DemoController {
	
	@Autowired
	private MovieRepository movieRepo;
	
	@RequestMapping("home")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("register")
	public ModelAndView getRegister() {
		return new ModelAndView("reg");
	}
	
	@RequestMapping("insertMovie")
	public ModelAndView insertMovie(@RequestParam String moviename,@RequestParam String director,@RequestParam String language, @ModelAttribute Movies movie) {
		
		ModelAndView mv = new ModelAndView("success");
		movieRepo.save(movie);
		//mv.addObject("mid", mid);
		mv.addObject("moviename",moviename);
		mv.addObject("director", director);
		mv.addObject("language", language);
		
		
		return mv;
	}
	
	@RequestMapping("viewmovies")
	public ModelAndView viewAllMovies() {
		ModelAndView mv = new ModelAndView("viewallmovies");
		List<Movies> li = movieRepo.findAll();
		
		mv.addObject("movies", li);
		return mv;
	}
}
