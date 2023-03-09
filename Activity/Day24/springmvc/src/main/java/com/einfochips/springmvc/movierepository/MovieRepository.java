package com.einfochips.springmvc.movierepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.springmvc.model.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer> {
	
	

}
