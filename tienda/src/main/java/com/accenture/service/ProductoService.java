package com.accenture.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.models.Producto;

@Service
public class ProductoService {
	
	//ListadoProductos
	private List<Producto> productos;
	
	public ProductoService() {
		productos = new ArrayList<>();
		productos.add(new Producto(1,"gaseosa",1200));
		productos.add(new Producto(2,"papitas",2000));
		productos.add(new Producto(3,"chocolatina",700));
		productos.add(new Producto(4,"galleta",1500));
	}
	
	public List<Producto> listarProductos(){
		return productos;
	}

}
