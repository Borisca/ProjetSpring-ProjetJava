package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/list")
	public String customerRequest() {
		
		return "customer";
	}
	
	@RequestMapping("/list-customer")
	public String customerList() {
		
		return "customer-list";
	}
	
}
