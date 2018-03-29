package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.CityDAO;
import com.entity.City;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CityDAO ci;
	
	@RequestMapping("/list")
	public String customerRequest(Model model) {
		List<City> q=ci.getCities();
		model.addAttribute("listCity",q);
		return "customer-list";
	}

	
	

}
