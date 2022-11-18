package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class server1Controller {
    @GetMapping(value="/Message")
	public String message(){
		return "Service 1 API is called";
		
	}
}
