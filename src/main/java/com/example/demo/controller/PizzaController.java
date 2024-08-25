package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Pizza;
import com.example.demo.repo.PizzaRepository;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

   // repository field con autowired per dependency injection	
	
	@Autowired
	private PizzaRepository repo;
	
	@GetMapping()
	public String index(Model model) {
		
		// consegna dei dati a pizzas/index
		List<Pizza> pizzaList = repo.findAll();
		
		model.addAttribute("pizzas", pizzaList);
		
		return "/pizzas/index";
	}
	
}
