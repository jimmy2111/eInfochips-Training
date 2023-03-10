package com.einfochips.springmvc.movierepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.springmvc.model.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer> {
	List<Movies> findByLanguage(String language);
	
	

}
