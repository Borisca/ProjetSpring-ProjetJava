package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.CustomerDAO;
import com.entity.Customer;




@Controller
@RequestMapping("/customer")
public class CustomerController {
//
	@Autowired()
	private CustomerDAO customerDao;
//	
	
	@RequestMapping("/list")
	public String listCustomer(Model model) {

		List<Customer> a = customerDao.getCustomers();
		model.addAttribute("customers", a);
		return "customer";
	}

	
	

}
