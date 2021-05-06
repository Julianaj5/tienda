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
		productos.add(new Producto(1,"gaseosa",1.200));
		productos.add(new Producto(2,"papitas",2.000));
		productos.add(new Producto(1,"chocolatina",700));
		productos.add(new Producto(1,"galleta",1.500));
	}
	
	public List<Producto> listarProductos(){
		return productos;
	}

}
