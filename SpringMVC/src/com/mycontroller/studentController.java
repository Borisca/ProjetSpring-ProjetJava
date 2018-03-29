package com.mycontroller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.model.confAnnotation;
@Controller
@RequestMapping("/formulaire")
public class studentController {

	//CONTEXT POUR LA VERSION DIFFICILE AVEC SPRING
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(confAnnotation.class);
	
	@RequestMapping("/form")
	public String showMyPage(Model model) {
		//CREATION DUN STUDENT AU CLIQUE DU BOUTON AVEC LES BONS PARAMETRES LIé PAR LEUR NOM DANS HTML
		//VERSION FACILE
		//Student myStudent =new Student();
		
		//VERSION BEAN
		Student myStudent=context.getBean("createMyStudent",Student.class);
		model.addAttribute("myStudent",myStudent);


		return "menu-form";
	}
	
	@RequestMapping("/salut")
	public String getSalut(@ModelAttribute("myStudent")Student myStudent,BindingResult myBinding) {
		//ON INJECTE lE BON MODELE DANS NOTRE METHODE ET PAF CA FAIT DES CHOCAPIC
		return "page2";
	}
}
