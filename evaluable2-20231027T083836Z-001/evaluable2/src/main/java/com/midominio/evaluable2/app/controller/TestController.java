package com.midominio.evaluable2.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.midominio.evaluable2.app.service.LibroService;
import com.midominio.evaluable2.app.service.MultiService;
import com.midominio.evaluable2.app.service.UsuarioService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	LibroService libroService;
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	MultiService multiService;
	@ModelAttribute(name = "titulo")
	String devuelveTitulo() {
		return "Tests";
	}
	@GetMapping("/test1")
	public String test1(Model model) {
		model.addAttribute("numLibros", libroService.count());
		model.addAttribute("numUsuarios", usuarioService.count());
		return "test/test1";	
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		libroService.deleteAll();
		model.addAttribute("numLibros", libroService.count());
		model.addAttribute("numUsuarios", usuarioService.count());
		return "test/test1";
	}
	
	@GetMapping("/test3")
	public String test3(@RequestParam Long id, Model model) {
		model.addAttribute("tituloH1", "Test request param id");
		if(libroService.existsById(id)) {
			model.addAttribute("resultado", "El id = " + id + " si existe");
		} else {
			model.addAttribute("resultado", "El id = " + id + " no existe");
		}
		return "test/existencia-libro";
	}
	
	@GetMapping("/test4/{id}")
	public String test4(@PathVariable Long id, Model model) {
		model.addAttribute("tituloH1", "Test request param id");
		if(libroService.existsById(id)) {
			model.addAttribute("resultado", "El id = " + id + " si existe");
		} else {
			model.addAttribute("resultado", "El id = " + id + " no existe");
		}
		return "test/existencia-libro";
	}
	
	@GetMapping("/test5")
	public String test5(Model model) {
		model.addAttribute("tituloH1", "Test lista de libros");
		model.addAttribute("libros", libroService.findAll());
		return "test/lista-libros";
	}
	
	
	@GetMapping("/test6")
	public String test6(@RequestParam Long id, Model model) {
		model.addAttribute("tituloH1", "Test borra libro");
		libroService.deleteById(id);
		model.addAttribute("libro", libroService.findAll());
		return "test/lista-libros";
	}
	
	@GetMapping("/test7")
	public String test7(@RequestParam Long id, Model model) {
		model.addAttribute("tituloH1", "Test encuentra libro");
		model.addAttribute("libro", libroService.findById(id).orElse(null));
		model.addAttribute("idSolicitado", id);
		return "test/libro";
	}
	
	@GetMapping("/test100")
	public String test100(Model model) {
		multiService.destruyeElMundo();
		model.addAttribute("numLibros", libroService.count());
		model.addAttribute("numUsuarios", usuarioService.count());
		return "test/test1";
	}
	
	@GetMapping("/test8")
	public String test8(@RequestParam Long id, Model model) {
		model.addAttribute("tituloH1", "Test request param id");
		if(usuarioService.existsById(id)) {
			model.addAttribute("resultado", "El id = " + id + " si existe");
		} else {
			model.addAttribute("resultado", "El id = " + id + " no existe");
		}
		return "test/existencia-usuario";
	}
	
	@GetMapping("/test9/{id}")
	public String test9(@PathVariable Long id, Model model) {
		model.addAttribute("tituloH1", "Test request param id");
		if(usuarioService.existsById(id)) {
			model.addAttribute("resultado", "El id = " + id + " si existe");
		} else {
			model.addAttribute("resultado", "El id = " + id + " no existe");
		}
		return "test/existencia-usuario";
	}
	
	@GetMapping("/test10")
	public String test10(Model model) {
		model.addAttribute("tituloH1", "Test lista de usuarios");
		model.addAttribute("usuarios", usuarioService.findAll());
		return "test/lista-usuarios";
	}
	
	
	@GetMapping("/test11")
	public String test11(@RequestParam Long id, Model model) {
		model.addAttribute("tituloH1", "Test borra usuario");
		usuarioService.deleteById(id);
		model.addAttribute("usuario", usuarioService.findAll());
		return "test/lista-usuarios";
	}
	
	@GetMapping("/test12")
	public String test12(@RequestParam Long id, Model model) {
		model.addAttribute("tituloH1", "Test encuentra usuario");
		model.addAttribute("usuario", usuarioService.findById(id).orElse(null));
		model.addAttribute("idSolicitado", id);
		return "test/usuarios";
	}
}
