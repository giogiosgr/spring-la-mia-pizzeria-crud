package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import com.example.demo.model.Pizza;
import com.example.demo.repo.PizzaRepository;

@SuppressWarnings("unused")

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

   // repository field con autowired per dependency injection	
	
	@Autowired
	private PizzaRepository repo;
	
	@GetMapping
	public String index(Model model) {
		
		// consegna dei dati a pizzas/index
		model.addAttribute("pizzas", repo.findAll());
		
		return "/pizzas/index";
	}
	
	@GetMapping("/index/{id}")
	public String pizzaDetails(@PathVariable int id, Model model) {
		
		// consegna al model di una specifica entità pizza tramite ID		
		model.addAttribute("pizza", repo.findById(id).get());
		
		return "/pizzas/show";
	}
	
}
