package com.einfochips.springmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movies {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int mid;
	private String moviename;
	private String director;
	private String language;
	public Movies(int mid, String moviename, String director, String language) {
		super();
		this.mid = mid;
		this.moviename = moviename;
		this.director = director;
		this.language = language;
	}
	public Movies() {
		super();
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", moviename=" + moviename + ", director=" + director + ", language=" + language
				+ "]";
	}
	
	

}
