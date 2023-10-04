package com.midominio.animales.web.app.controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.animales.web.app.model.Animal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animales")
public class AnimalController {
	
	@GetMapping("/ungato")
	public String gato(Model model) {
		model.addAttribute("titulo", "Un gato");
		model.addAttribute("cabecera", "Mostrando un gato");
		model.addAttribute("texto", "Estos son los datos de mi gato:");
		Animal gato = new Animal (75, 2450, "gato");
		model.addAttribute("tipo", "Tipo:" + gato.getTipo());
		model.addAttribute("peso", "Peso:" + gato.getPeso());
		model.addAttribute("precio", "Precio:" + gato.getPrecio());
		return "animales/gato";
	}
	
	@GetMapping("/ningungato")
	public String ningungato(Model model) {
		Animal gato = null;
		model.addAttribute("titulo", "Ningun gato");
		model.addAttribute("cabecera", "Mostrando ningun gato");
		model.addAttribute("texto", "No hay ningun gato para mostrar su información");
		return "animales/gato";
	}
	
	@GetMapping("/lista")
	public String listaAnimales(Model model) {
		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(new Animal(80, 2631, "gato"));
		listaAnimales.add(new Animal(145, 30652, "perro"));
		listaAnimales.add(new Animal(800, 1230, "loro"));
		model.addAttribute("milistaAnimales", listaAnimales);
		model.addAttribute("titulo", "Lista de animales");
		model.addAttribute("cabecera", "Mostrando lista de animales");
		model.addAttribute("texto", "Estos son los datos de la lista de animales:");
		return "animales/lista";
	}
	
	@ModelAttribute("/milista1")
	public List<Animal> listaAnimales1(){
		List<Animal> animales = new ArrayList<>();
		animales.add(new Animal(50, 2840, "gato"));
		animales.add(new Animal(700, 50236, "perro"));
		animales.add(new Animal(400, 5024, "perro"));
		return animales;		
	} 
	@ModelAttribute("/milista2")
	public List<Animal> listaAnimales2(){
		List<Animal> animales = new ArrayList<>();
		animales.add(new Animal(90, 1203, "perro"));
		animales.add(new Animal(50, 4520, "gato"));
		animales.add(new Animal(90, 800, "loro"));
		animales.add(new Animal(52, 8023, "perro"));
		animales.add(new Animal(12, 5210, "gato"));
		return animales;		
	} 	
}
