package com.midominio.evaluable2.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaInicialController {
	
	@GetMapping("/home")
	public String m(Model model) {
		model.addAttribute("titulo", "Pagina principal");
		model.addAttribute("cabecera", "Biblioteca");
		model.addAttribute("parrafo", "Informacion de libros y usuarios:");
		return "/paginainicial/inicial";
	}
}