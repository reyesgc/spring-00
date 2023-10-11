package com.midominio.coches.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.coches.app.web.CochesApplication;

@Controller
@RequestMapping("/ejemplos")
public class EjemploServicioController {
	
	@GetMapping("/1")
	public String m(Model model) {
		Coche miCoche = new Coche(1, "ford", "verde", 2010);
		return"" ;
	}
}
