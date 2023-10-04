package com.midominio.coches.app.web.model;

public class Coche {
	private int id;
	private String marca;
	private String color;
	private int frabricadoEn;
	
	public Coche(int id, String marca, String color, int frabricadoEn) {
		super();
		this.id = id;
		this.marca = marca;
		this.color = color;
		this.frabricadoEn = frabricadoEn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFrabricadoEn() {
		return frabricadoEn;
	}

	public void setFrabricadoEn(int frabricadoEn) {
		this.frabricadoEn = frabricadoEn;
	}
	
	
}