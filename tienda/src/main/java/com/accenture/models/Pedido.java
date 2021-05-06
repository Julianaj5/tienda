package com.accenture.models;

import java.util.Date;

public class Pedido {
	private int id;
	private int cedulaCliente;
	private String nombreCliente;
	private int idProducto;
	private double totalPedido;
	private Date fecha = new Date();
	
		
	public Pedido(int id, int cedulaCliente,  int idProducto, double totalPedido) {
		super();
		this.id = id;
		this.cedulaCliente = cedulaCliente;
		this.idProducto = idProducto;
		this.totalPedido = totalPedido;
		fecha.getDate();
	
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCedulaCliente(int cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public int getCedulaCliente() {
		return cedulaCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public int getIdProducto() {
		return idProducto;
	}
	
	
	
	

}
