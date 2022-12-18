package com.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/dashboard")
	public String checkAuth() {
		return "Authontication Successfull";
	}
	
	@GetMapping("/getData")
	public String getData() {
		return "Employee Data Retrieved";
	}
}
