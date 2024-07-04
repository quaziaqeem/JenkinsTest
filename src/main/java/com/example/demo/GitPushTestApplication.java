package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitPushTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitPushTestApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloTechM() {
		String msg ;
		return msg = "hello jenkins";
	}
	
	//below is the 2nd push to git
	
	@GetMapping("/greeting")
	public String greeting() {
		String msg ;
		return msg = "Good Morning Jenkins";
	}

}
