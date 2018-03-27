package com.mycontroller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@RequestMapping("/form")
	public String customerForm(Model model) {
		Customer cust=new Customer();
		model.addAttribute("customer",cust);
		
		return "customerForm";
	}
	
	@RequestMapping("/page")	
	public String valider(@Valid @ModelAttribute("customer")Customer cust,BindingResult myBinding) {
		

		if(!myBinding.hasErrors())
			return "customerPage";
		else
			return "customerForm";
	}
}
