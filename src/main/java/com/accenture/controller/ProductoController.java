package com.accenture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.models.Producto;
import com.accenture.service.ProductoService;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
	
	private final ProductoService productoService;
	
	public ProductoController (ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping
	public Iterable<Producto>listarProducto(){
		return productoService.listarProductos();
	}
	
	

}
