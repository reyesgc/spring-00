package com.midominio.demoarticulos.web.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.midominio.demoarticulos.web.app.model.Articulo;

@Service
public class ArticuloService {
	
	public Articulo dameArticulodemo() {
		return new Articulo(3, "Orbea", "x345", "Deporte", 357);
	}
	
	public Articulo dameArticulonull() {
		return null;
	}
	
	public static List<Articulo> dameListaArticulos(){
		List<Articulo> lista = new ArrayList<>();
		lista.add(new Articulo(5, "Orbea", "x-345", "DEPORTE", 1357));
		lista.add(new Articulo(15, "BH", "VBV", "DEPORTE", 2399));
		lista.add(new Articulo(9, "TRENN", "Cinta Correr plus one", "SALUD", 24));
		lista.add(new Articulo(25, "Acme", "cd23", "SALUD", 17));
		lista.add(new Articulo(15, "Acme", "altrom", "OCIO", 239));
		lista.add(new Articulo(95, "TRENN", "Coltron", "OCIO", 234));
		return lista;
	}
	
	public List<Articulo> dameTodosLosArticulos(){
		return ArticuloService.dameListaArticulos(); 
	}
	
	public List<Articulo> dameArticulosDadaUnaCantidad(int cantidad){
		List<Articulo> lista = new ArrayList<>();
		for(Articulo a : ArticuloService.dameListaArticulos()) {
			if(a.getCantidad() == cantidad) {
				lista.add(a);
			}
		}
		return lista;
	}
	
	public List<Articulo> dameArticulosDadoUnTipo(String tipo){
		List<Articulo> lista = new ArrayList<>();
		for(Articulo a : ArticuloService.dameListaArticulos()) {
			if(tipo.equals(a.getTipo())) {
				lista.add(a);
			}
		}
		return lista;
}}
