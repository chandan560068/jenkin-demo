package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/getname")
	public String gellall(){
		
		
		return "hello chandan......";
	}

}
