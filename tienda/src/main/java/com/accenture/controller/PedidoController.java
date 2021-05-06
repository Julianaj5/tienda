package com.accenture.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.models.Cliente;
import com.accenture.models.Pedido;
import com.accenture.service.PedidoService;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
	
	private final PedidoService pedidoService;
	
	public PedidoController(PedidoService pedidoService){
		this.pedidoService = pedidoService;
	}
	
	@GetMapping("/{cedula}")
	public Cliente encontrarCliente(@PathVariable("cedula") int cedula) {
		return pedidoService.encontrarCliente(cedula);
	}
	
	

}
