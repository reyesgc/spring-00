package com.midominio.evaluable2.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.evaluable2.app.model.Usuarios;

@Controller
@RequestMapping("/datos")
public class UsuariosController {
	
	@GetMapping("/usuarios")
	public String listadoUsuarios(Model model) {
		List<Usuarios> usuarios = new ArrayList<>();
		model.addAttribute("titulo", "Usuarios");
		model.addAttribute("cabecera", "Lista de usuarios");
		model.addAttribute("parrafo", "A continuacion se mostrara la lista de usuarios:");
		usuarios.add(new Usuarios("Lucia", "Rodriguez", 4152256));
		usuarios.add(new Usuarios("Alvaro", "García", 7845963));
		usuarios.add(new Usuarios("Martin", "Dorado", 4589632));
		usuarios.add(new Usuarios("Javier", "Anguita", 9563210));
		usuarios.add(new Usuarios("Laura", "Lopez", 4856216));
		usuarios.add(new Usuarios("Marta", "Gonzalez", 5123697));
		usuarios.add(new Usuarios("Sheyla", "Alvarez", 8452061));
		usuarios.add(new Usuarios("Mario", "Velero", 5201520));
		usuarios.add(new Usuarios("Victor", "Corcoles", 5326262));
		usuarios.add(new Usuarios("Lia", "Martinez", 8152110));
		usuarios.add(new Usuarios("Maria", "Aranda", 7852545));
		usuarios.add(new Usuarios("Daniel", "Castro", 7411215));
		model.addAttribute("listadoUsuarios", usuarios);
		return "datos/usuarios";
	}
}
