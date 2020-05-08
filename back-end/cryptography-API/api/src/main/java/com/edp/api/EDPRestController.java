package com.edp.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EDPRestController {
	
	@GetMapping("/hello")
	String sayHello() {
		return "Hello, World!";
		
	}
}
