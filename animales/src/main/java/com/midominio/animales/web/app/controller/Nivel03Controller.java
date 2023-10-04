package com.midominio.animales.web.app.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.animales.web.app.model.Animal;
import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/animales")
public class Nivel03Controller {
	//localhost:8080/animales/listado_flexible
	
	@Value("titulo")
	private String tituloNavegador;
	
	@GetMapping("/ejemplo")
	public String m(Model model) {
		model.addAttribute("TituloNavegador", tituloNavegador);
		return "animales/ejemplo1";
	}
	
	public List<Animal> listadoCompletoAnimales() {
		List<Animal> animales = new ArrayList<>();
		animales.add(new Animal(50, 2350, "gato"));
		animales.add(new Animal(1250, 17220, "perro"));
		animales.add(new Animal(75, 3500, "perro"));
		animales.add(new Animal(235, 5400, "gato"));
		animales.add(new Animal(172, 50300, "perro"));
		animales.add(new Animal(350, 75300, "perro"));
		animales.add(new Animal(140, 9044, "gato"));
		animales.add(new Animal(800, 18333, "perro"));
		animales.add(new Animal(1500, 9430, "gato"));
		animales.add(new Animal(13800, 18050, "mono"));
		animales.add(new Animal(100, 190, "pájaro"));
		animales.add(new Animal(19500, 25800, "perro"));
		animales.add(new Animal(17200, 18600, "mono"));
		animales.add(new Animal(4000, 9300, "gato"));
		animales.add(new Animal(230, 200, "pájaro"));
		animales.add(new Animal(8700, 6500, "gato"));
		animales.add(new Animal(16900, 17500, "mono"));
		animales.add(new Animal(14700, 11500, "perro"));
		animales.add(new Animal(6000, 220, "pájaro"));
		animales.add(new Animal(9200, 70, "camaleón"));
		animales.add(new Animal(6600, 200, "pájaro"));
		animales.add(new Animal(4300, 9300, "gato"));
		animales.add(new Animal(8100, 20300, "mono"));
		animales.add(new Animal(9800, 160, "pájaro"));
		animales.add(new Animal(7700, 19200, "perro"));
		return animales;
	}
	
	
	@GetMapping({ "/listado-flexible", "/listadoflexible" })
	public String listadoFlexible(Model model) {

		model.addAttribute("cabecera",
				"Mostrando lista completa de " + this.listadoCompletoAnimales().size() + " animales");
		model.addAttribute("textoListaVacia", "No hay ningún animal que mostrar.");
		model.addAttribute("texto", "Esta es la lista de animales");
		model.addAttribute("animales", listadoCompletoAnimales());

		return "animales/lista-animales";
	}
	
	@GetMapping({"/listado-flexible2", "/listadoflexible2"})
	public String listadoFlexible2(Model model) {
		List<Animal> listaCompleta = listadoCompletoAnimales();
		List<Animal> listaFiltrada = new ArrayList<>();
		for(int i = 0; i<10; i++) {
			listaFiltrada.add(listaCompleta.get(i));
		}
		return"/animales/lista-animales";
	}
	
	@GetMapping({"/listado-flexible3", "/listadoflexible3"})
	public String listadoFlexible3(@RequestParam int cantidad, Model model) {
		List<Animal> listaCompleta = listadoCompletoAnimales();
		cantidad = cantidad < 0 ? 0: cantidad> listaCompleta.size() ? listaCompleta.size(): cantidad;
		List<Animal> listaFiltrada = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			listaFiltrada.add(listaCompleta.get(i));
		}

		model.addAttribute("cabecera", "Mostrando lista completa de " + listaFiltrada.size() + " animales");
		model.addAttribute("textovacio", "No hay ningún animal que mostrar.");
		model.addAttribute("texto", "Esta es la lista de animales");
		model.addAttribute("animales", listaFiltrada);

		return "animales/lista-animales";
	}
	
}