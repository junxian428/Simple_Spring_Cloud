package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class server2Controller {
    @GetMapping(value="/Message")
	public String message(){
		return "Service 2 API is called";
		
	}
}
