package com.midominio.proyecto00.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controlador {
	
	@GetMapping("/saluda")
	public String n2() {
		return "vista";
	}
	@GetMapping("/despide")
	public String h3(){
		return "vista1";
	}
}
