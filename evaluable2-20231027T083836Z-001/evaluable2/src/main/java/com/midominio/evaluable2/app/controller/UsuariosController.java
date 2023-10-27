package com.midominio.evaluable2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuariosController {
	@GetMapping("usuarios")
	public String m(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("cabecera", "Listado de usuarios");
		model.addAttribute("parrafo", "A continuación se mostrará el listado de usuarios:");
		return"/usuarios";
	}
}
