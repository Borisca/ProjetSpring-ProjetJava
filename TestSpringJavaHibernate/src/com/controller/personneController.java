package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Personne;
import com.service.ServiceDao;

@Controller
@RequestMapping("/")
public class personneController {
	
	@Autowired
	ServiceDao serv;
	
	@RequestMapping("")
	public String home(){
	
		return "redirect:home";
	}
	
	@RequestMapping("/home")
	public String affichageList(Model model){
		
		model.addAttribute("listPersonnes",serv.getListPersonne());	
		return "ListPage";
	}
	
	
	@RequestMapping("/pageFormulaireUser")
	public String formulaireUser(Model model) {
		model.addAttribute("personne",new Personne());
		return"AddPage";
	}
	
	@RequestMapping("/addUser")
	public String affichageAjout(@ModelAttribute("personne")Personne pers) {
		
		if (pers.getiD()==0)
			serv.addPersonne(pers);
		else
			serv.updatePersonne(pers);
		
		return "redirect:home";
	}
	
	@RequestMapping("/removeUser")
	public String removePersonne(@Valid @RequestParam("iD") int iD,Model model) {
		
		serv.removePersonne(serv.getPersonne(iD));
		return "redirect:home";
	}
	
	@RequestMapping("/updateUser")
	
	public String updatePersonne(@RequestParam("iD") int iD,Model model) {

		model.addAttribute("personne",serv.getPersonne(iD));

		return "AddPage";
	}
	

}
