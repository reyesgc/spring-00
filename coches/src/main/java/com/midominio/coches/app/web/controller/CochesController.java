package com.midominio.coches.app.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.coches.app.web.model.Coche;


@Controller
@RequestMapping("/coche")
public class CochesController {
	
	@GetMapping({"/home", "/"})
	public String paginahome(Model model) {
		model.addAttribute("titulo", "Página principal de listado de coches");
		model.addAttribute("cabecera", "Información del listado de coches");
		model.addAttribute("texto", "Se mostrará la siguiente información de los coches: id, marca, color y fecha de fabricación");
		return "/coches/paginaprincipal";
	}
	
	public List<Coche> listadoCompletoCoches() {
		List<Coche> coches = new ArrayList<>();
		coches.add(new Coche(7452, "Opel", "Rojo", 14/05/19));
		coches.add(new Coche(1458, "Volkswagen", "Blanco", 19/06/17));
		coches.add(new Coche(4152, "BMW", "Azul", 23/10/14));
		coches.add(new Coche(4754, "Ferrari", "Negro", 07/12/16));
		coches.add(new Coche(8512, "Renault", "Morado", 18/10/20));
		coches.add(new Coche(6250, "Mercedes", "Amarillo", 04/11/02));
		coches.add(new Coche(9652, "Tesla", "Rosa", 28/05/21));
		coches.add(new Coche(3210, "SEAT", "Gris", 04/10/05));
		coches.add(new Coche(1520, "Audi", "Verde", 14/04/14));
		coches.add(new Coche(0512, "Mitsubishi", "Azul", 07/11/15));
		coches.add(new Coche(7041, "KIA", "Rojo", 01/05/06));
		coches.add(new Coche(6512, "Jaguar", "Azul marino", 19/07/22));
		coches.add(new Coche(1450, "Suzuki", "Verde oscuro", 13/04/15));
		coches.add(new Coche(5210, "Chevrolet", "Beige", 18/06/23));
		coches.add(new Coche(8541, "Suzuki", "Gris", 27/05/14));
		coches.add(new Coche(8541, "KIA", "Rojo", 26/07/17));
		coches.add(new Coche(8541, "KIA", "Rojo", 26/05/14));
		coches.add(new Coche(8541, "KIA", "Rojo", 26/05/14));
		coches.add(new Coche(8541, "KIA", "Rojo", 26/05/14));
		coches.add(new Coche(8541, "KIA", "Rojo", 26/05/14));
		coches.add(new Coche(8541, "KIA", "Rojo", 26/05/14));
		coches.add(new Coche(8541, "KIA", "Rojo", 26/05/14));
		return coches;
	}
	
}
