package com.midominio.evaluable2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model){
		model.addAttribute("titulo", "Página Incial");
		model.addAttribute("cabecera", "Biblioteca");
		model.addAttribute("parrafo", "Se mostrará un par de listados, uno de libros y otro de usuarios:");
		return "/home";
	}
			
}
