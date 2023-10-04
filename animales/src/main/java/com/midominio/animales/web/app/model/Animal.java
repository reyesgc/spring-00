package com.midominio.animales.web.app.model;

public class Animal {
	private String tipo;
	private int peso;
	private int precio;
	public Animal(int precio, int peso, String tipo) {
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
