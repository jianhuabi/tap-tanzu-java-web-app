package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Tanzu TAPv1.0! + Demo CI v1 + TAPv1.1.0.build.9 + supplyChain Dashboard";
	}

}
