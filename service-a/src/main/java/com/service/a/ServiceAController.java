package com.service.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceAController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/servicea")
	String callServiceB() {
		String response = restTemplate.getForObject("http://SERVICE-B/user", String.class);
		return response;
	}
}
