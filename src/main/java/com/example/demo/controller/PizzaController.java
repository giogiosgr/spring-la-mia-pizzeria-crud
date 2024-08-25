package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

   // repository field con autowired per dependency injection	
	
	public String index(Model model) {
		
		// dati da consegnare a pizzas
		
		return "/pizzas/index";
	}
	
}
