package com.midominio.proyecto00.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.proyecto00.web.app.model.Animal;

@Controller
@RequestMapping("/animales")
public class AnimalController {
	 
	@GetMapping("/ungato")
	public String gato(Model model) {
		Animal gato = new Animal("gato", 1450, 75);
		
		
		model.addAttribute("titulo", "Un gato");
		model.addAttribute("cabecera", "Mostrando un gato");
		model.addAttribute("texto", "Estos son los datos de mi gato:");
		model.addAttribute("tipo"+gato.getTipo());
		model.addAttribute("peso" +gato.getPeso());
		model.addAttribute("precio"+ gato.getPrecio());
		
		return "/animales/gato";
	}
	
	@GetMapping({"/perro", "/1perro"})
	public String perro(Model model) {
		model.addAttribute("titulo", "Un perro");
		model.addAttribute("cabecera", "Mostrando un perro");
		model.addAttribute("texto", "Estos son los datos de mi perro:");
		return "/animales/perro";
	}
}