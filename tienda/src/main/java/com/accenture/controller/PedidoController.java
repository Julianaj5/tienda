package com.accenture.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping
	public Iterable<Pedido> listarPedido(){
		return pedidoService.listarPedidos();
	}
	

	
	@PostMapping
	public Pedido crearPedido (@RequestBody Pedido pedido) {
		return pedidoService.crearPedido(pedido);
	}
	
	
	
	@GetMapping("/{id}")
	public Pedido factura(@PathVariable("id") int id) {
		return pedidoService.factura(id);
	}
	
	
	@PutMapping("/{id}")
	public Pedido actualizarCliente(@PathVariable("id") int id, @RequestBody Pedido pedido) {
		return pedidoService.actualizarPedido(id, pedido);
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminarPedido(@PathVariable("id") int id) {
		return pedidoService.eliminarPedido(id);
		
	}
	
	

}
