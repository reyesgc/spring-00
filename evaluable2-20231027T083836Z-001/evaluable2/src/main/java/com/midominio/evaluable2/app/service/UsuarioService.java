package com.midominio.evaluable2.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.midominio.evaluable2.app.dao.UsuarioRepository;
import com.midominio.evaluable2.app.entity.Libro;
import com.midominio.evaluable2.app.entity.Usuario;


@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public long count() {
		return usuarioRepository.count();
	}
	
	public void deleteAll() {
		usuarioRepository.deleteAll();
	}
	
	public boolean existsById(Long id) {
		return usuarioRepository.existsById(id);
	}
	
	public Iterable <Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	public Optional <Usuario> findById(Long id) {
		 return usuarioRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario save (Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
