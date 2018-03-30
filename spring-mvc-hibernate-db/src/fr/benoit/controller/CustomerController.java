package fr.benoit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.benoit.db.entity.Customer;
import fr.boris.service.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController {

	@Autowired
	private CustomerService ser;

	
	@RequestMapping("/")
	public String getListCustomers(Model model) {
		

		return "customer";
	}

	@RequestMapping("/customer")
	public String showPage(Model model) {

		List<Customer> listCustomers = ser.getCustomers();

		model.addAttribute("listCustomers", listCustomers);
		return "customer-list";
	}

	
	@RequestMapping("/addCustomer")
	public String addCustomers(Model model) {
		
			Customer cust=new Customer();
			model.addAttribute("cust",cust);
			return "addCust";
	}
	@RequestMapping("/affichage")
	public String affichage(@Valid @ModelAttribute("cust")Customer cust,BindingResult myBinding,Model model) {
		
			ser.addCustomer(cust);
			return "redirect:customer";
	
		
		
	}
	
	@RequestMapping("/updatePage")
	public String update(@RequestParam("identity") int ident,Model model){
		
		Customer cust=ser.getCustomer(ident);
		model.addAttribute("cust",cust);
		ser.removeCustomer(cust);
		return"addCust";
	}
	
	@RequestMapping("/removePage")
	public String removeCustomer(@RequestParam("identity") int ident,Model model) {
		Customer cust=ser.getCustomer(ident);
		ser.removeCustomer(cust);
		System.out.println(cust);
		return "redirect:customer";
		
	}

}
