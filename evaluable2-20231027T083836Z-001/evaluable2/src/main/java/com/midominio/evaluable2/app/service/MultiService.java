package com.midominio.evaluable2.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midominio.evaluable2.app.dao.LibroRepository;
import com.midominio.evaluable2.app.dao.UsuarioRepository;

@Service
public class MultiService {
	@Autowired
	LibroRepository libroRepository;
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void destruyeElMundo() {
		libroRepository.deleteAll();
		usuarioRepository.deleteAll(); 
	}
}
