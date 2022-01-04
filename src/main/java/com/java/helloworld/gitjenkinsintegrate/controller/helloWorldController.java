package com.java.helloworld.gitjenkinsintegrate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "HelloWorld from Github";
	}

}
