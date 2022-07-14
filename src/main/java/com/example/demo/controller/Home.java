package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Home {

	@GetMapping
	public String welcome() {
		String text= "This is a private Page";
		text+= "Authorized Users can only Access it";
		
		return text;
	}
}
