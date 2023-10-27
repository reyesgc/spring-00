package com.midominio.evaluable2.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.midominio.evaluable2.app.service.LibroService;

@Controller
public class LibrosController { 
	
	@Autowired
	LibroService libroService;
	@GetMapping("/libros")
	public String m(Model model) {
		model.addAttribute("titulo","Listado de libros");
		model.addAttribute("cabecera","Listado de libros");
		model.addAttribute("parrafo","A continuación se mostrará el listado de libros:");
		return"/libros";
	}
	
	
}
