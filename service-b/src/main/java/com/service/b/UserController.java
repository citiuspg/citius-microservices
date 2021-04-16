package com.service.b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable("id") int id) {
		System.out.println(id);
		return "Ram";
	}
}
