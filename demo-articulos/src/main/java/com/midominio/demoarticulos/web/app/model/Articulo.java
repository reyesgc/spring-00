package com.midominio.demoarticulos.web.app.model;

public class Articulo {
	
	private double precio;
	private String marca;
	private String modelo;
	private String tipo;
	private int cantidad;
	
	
	public Articulo(int cantidad, String marca, String modelo, String tipo, double precio) {
		super();
		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	
	
}
