package com.midominio.demoarticulos.web.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.demoarticulos.web.app.model.Articulo;
import com.midominio.demoarticulos.web.app.service.ArticuloService;

@Controller
public class ArticuloController {
	
	@Autowired
	ArticuloService articuloService;
	
	@Value("Lista de artículos")
	private String h1Listados;
	@Value("Información del artículo")
	private String h1Informacion;
	
	@ModelAttribute("titulo")
	private String tituloArriba() {
		return "Articulos";
	}
	
	@GetMapping("/articulo/unarticulo-demo")
	public String m(Model model) {
		model.addAttribute("titulo", "Articulos");
		model.addAttribute("tituloh1", "Información del articulo");
		//Articulo a = new Articulo (3, "Orbea", "x345", "Deporte", 357);
		//model.addAttribute("articulo", a);
		model.addAttribute("articulo", new ArticuloService().dameArticulodemo());
		return"articulo/un-articulo";
	}
	
	@GetMapping("/un-articulo-demo")
	public String n1(Model	 model) {
		
		model.addAttribute("tituloH1", h1Informacion);
		model.addAttribute("articulo", articuloService.dameArticulodemo());
		
		return "articulo/un-articulo";
	}
	
	@GetMapping("/un-articulo-null")
	public String articuloNull(Model model) {
		
	
		model.addAttribute("tituloH1", h1Informacion);
		model.addAttribute("articulo", articuloService.dameArticulonull());
		
		return "articulo/un-articulo";
	}
	
	@GetMapping("/lista")
	public String m1(Model model) {
		
		model.addAttribute("tituloH1", h1Listados);
		model.addAttribute("lista", articuloService.dameListaArticulos());
		
		return "articulo/listado";
	}
	
	@GetMapping("/articulo/listaparcial")
	public String m2(@RequestParam int cantidad, Model model) {
		
		model.addAttribute("tituloH1", h1Listados);
		model.addAttribute("lista", articuloService.dameArticulosDadaUnaCantidad(cantidad));
		
		return "articulo/listado";
	}

}

