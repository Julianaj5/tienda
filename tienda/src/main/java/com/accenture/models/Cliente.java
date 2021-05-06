package com.accenture.models;



public class Cliente {
	
	private int cedula;
	private String nombre;
	private String direccion;

	
	//constructores
	public Cliente() {
	
	}

	public Cliente(int cedula, String nombre, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		
	}
	
	
	//Getters y Setters

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	


	
	
	
	
	
	
	

}
