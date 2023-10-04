package com.midominio.proyecto01.web.app.controller;




import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.proyecto01.web.app.model.Animal;



@Controller
@RequestMapping("/animales")
public class Animales {
	
	@GetMapping("/ungato")
	public String gato(Model model) {
		Animal gato = new Animal("gato", 1450, 75);
		model.addAttribute("titulo", "Un gato");
		model.addAttribute("cabecera", "Mostrando un gato");
		model.addAttribute("texto", "Estos son los datos de mi gato:");
		model.addAttribute("tipo", "Tipo:" + gato.getTipo());
		model.addAttribute("peso", "Peso(gr):" + gato.getPeso());
		model.addAttribute("precio", "Precio(€):" + gato.getPrecio());
		return"/animales/gato";
	}
	
	@GetMapping("/ningungato")
	public String ningungato(Model model) {
		Animal gato = null;
		model.addAttribute("titulo", "Ningun gato");
		model.addAttribute("cabecera", "Mostrando ningun gato");
		model.addAttribute("texto", "No hay ningun gato para mostrar su informacion");
		return"/animales/gato";
	}
	
	@GetMapping("/lista")
	public String listaAnimales(Model model){
		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(new Animal("gato", 1450, 78));
		listaAnimales.add(new Animal("perro", 3650, 80));
		listaAnimales.add(new Animal("loro", 1204, 90));
		model.addAttribute("milistaAnimales", listaAnimales);
		model.addAttribute("titulo", "Lista de animales");
		model.addAttribute("cabecera", "Mostrando lista de animales");
		model.addAttribute("texto", "Esta es la maravillosa lista de animales");
		return"animales/lista";
		
	}
	
	
	
}