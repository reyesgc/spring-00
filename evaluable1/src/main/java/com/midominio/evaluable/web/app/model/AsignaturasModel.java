package com.midominio.evaluable.web.app.model;

public class AsignaturasModel {
	
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numeroCreditos;
	private int numeroalum = 0;
	
	
	
	public AsignaturasModel(int id, String nombre, String descripcion, String tipo, int numeroCreditos,
			int numeroalum) {
		if (numeroCreditos >= 3 && numeroCreditos <= 12) {
            System.out.println("El número de créditos está dentro del rango válido.");
        } else {
            System.out.println("El número de créditos está fuera del rango válido.");
        }
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.numeroalum = numeroalum +1;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripción(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroCreditos() {
		return numeroCreditos;
	}

	public void setNumeroCreditos(int numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

	public int getNumeroalum() {
		return numeroalum;
	}

	public void setNumeroalum(int numeroalum) {
		this.numeroalum = numeroalum;
	}
	
	
}
