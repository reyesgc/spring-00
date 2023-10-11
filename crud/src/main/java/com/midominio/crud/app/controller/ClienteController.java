package com.midominio.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.crud.app.dao.ClienteDao;
import com.midominio.crud.app.entity.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteDao clienteDao = new ClienteDao();
	
	@GetMapping("/listar")
	public String m(Model model) {
		List<Cliente> clientes = clienteDao.findAll();
		model.addAttribute("clientes", clientes);
		model.addAttribute("titulo", "Listado de clientes");
		return"cliente/listar";
	}
}
