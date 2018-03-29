package fr.benoit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.benoit.dao.CustomerDAO;
import fr.benoit.db.entity.Customer;
import fr.boris.service.ServiceImpl;

@Controller
@RequestMapping("/")
public class CustomerController {

	@Autowired
	private ServiceImpl ser;

	@RequestMapping("/customer")
	public String showPage(Model model) {
		List<Customer> listCustomers = ser.getCustomers();	
		
		model.addAttribute("listCustomers", listCustomers);
		// Test
		System.out.println("coucou "+listCustomers.toString());
		return "customer";
	}

	@RequestMapping("/customer-list")
	public String getListCustomers(Model model) {
		List<Customer> listCustomers = ser.getCustomers();	
		
		model.addAttribute("listCustomers", listCustomers);
		// Test
		System.out.println("coucou "+listCustomers.toString());
		return "customer";
	}

}
