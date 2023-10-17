package com.midominio.evaluable2.app.model;

public class Libros {
	
	private int id;
	private String nombre;
	private String autor;
	
	public Libros(int id, String nombre, String autor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
