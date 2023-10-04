package com.midominio.proyecto00.web.app.model;

public class Animal {
	private String tipo;
	private int peso; // gramos
	private int precio; // euros
	
	
	public Animal(String tipo, int peso, int precio) {
		super();
		this.tipo = tipo;
		this.peso = peso;
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
