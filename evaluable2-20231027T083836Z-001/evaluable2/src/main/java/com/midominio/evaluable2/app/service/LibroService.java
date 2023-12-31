package com.midominio.evaluable2.app.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midominio.evaluable2.app.dao.LibroRepository;
import com.midominio.evaluable2.app.entity.Libro;

@Service	
public class LibroService {
	@Autowired
	LibroRepository libroRepository;
	
	public long count() {
		return libroRepository.count();
	}
	
	public void deleteAll() {
		libroRepository.deleteAll();
	}
	
	public boolean existsById(Long id) {
		return libroRepository.existsById(id);
	}
	
	public Iterable <Libro> findAll() {
		return libroRepository.findAll();
	}
	
	public Optional <Libro> findById(Long id) {
		 return libroRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		libroRepository.deleteById(id);
	}
	
	public Libro save (Libro libro) {
		return libroRepository.save(libro);
	}
	

}
