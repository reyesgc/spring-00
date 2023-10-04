package com.midominio.proyecto0.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/nivel00")
@Controller
public class Nivel00Controller{
	
	@GetMapping("/holamundo01")
	public String holaMundo01(){
		return "nivel00/hola-mundo-01";
				
	}
	
	@GetMapping("/holamundo03")
	public String holaMundo03 (Model model) {
		model.addAttribute("tituloHeader", "Hola mundo 03");
		model.addAttribute("titulo", "Hola mundo 03!!!");
		model.addAttribute("parrafo","Esta es la tercera versión del hola mundo");
		return "nivel00/hola-mundo-03";
	}
	
}

