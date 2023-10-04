package com.midominio.proyecto0.web.app.controller;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dado")
public class Nivel01Controller {
	
	@GetMapping({"/uno", "/1"})
	public String lanzamientoundado(Model model) {
		Random random = new Random();
		model.addAttribute("titulo", "Lanzamiento de un dado al azar");
		model.addAttribute("cabecera", "Lanzamiento de un dado al azar");
		model.addAttribute("texto", "El valor del dado lanzado es");
		model.addAttribute("valor", random.nextInt(1,7));
		return "/dados/un-dado";
	}
	
	@GetMapping({"/dos", "/2"})
	public String lanzamientodosdados(Model model) {
		Random random = new Random();
		model.addAttribute("titulo", "Lanzamiento de dos dado al azar");
		model.addAttribute("cabecera", "Lanzamiento de dos dado al azar");
		model.addAttribute("texto", "El valor de los dados lanzados es");
		model.addAttribute("valor1", random.nextInt(1,7));
		model.addAttribute("valor2", random.nextInt(1,7));
		return "/dados/dos-dados";
	}

}
