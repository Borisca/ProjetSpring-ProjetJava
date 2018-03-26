package com.mycontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/hello")
public class NController {
	

		
		
//		Premiere solution sans annotations
//		@RequestMapping("/salut")
//		public String getSalut(HttpServletRequest request,Model model) {
//			
//			String str = request.getParameter("prenom");
//			System.out.println(str);
//			str=str.toUpperCase()+"ezaeazzaeaez";
//			System.out.println(str);
//			model.addAttribute("prenom2",str);
//
//			return "page2";
//		}
	
	
}
