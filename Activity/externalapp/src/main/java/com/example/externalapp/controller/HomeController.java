package com.example.externalapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {
	
	//@Autowired
	WebClient wc=WebClient.create();
	
	@RequestMapping("trainees")
	public ResponseEntity<String> getTrainees() {
		RestTemplate rt = new RestTemplate();
		return rt.getForEntity("http://localhost:8080/exttrainees",String.class );
	}
	
	@RequestMapping("reacttrainees")
	public Mono<String> getreact(){
		return wc.get()
				.uri("http://localhost:8080/exttrainees")
				.retrieve()
				.bodyToMono(String.class);
	}
	
	@RequestMapping("reacttrainees/{t_Id}")
	public Mono<String> getReactTraineesById(@PathVariable String t_Id){
		return wc.get()
				.uri("http://localhost:8080/exttrainees/"+t_Id)
				.retrieve()
				.bodyToMono(String.class);
	}

}
