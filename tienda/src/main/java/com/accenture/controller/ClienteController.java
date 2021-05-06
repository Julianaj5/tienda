package com.accenture.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.models.Cliente;
import com.accenture.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	private final ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping
	public Iterable<Cliente> listarCliente(){
		return clienteService.listarCliente();
	}
	
	@GetMapping("/{cedula}")
	public Cliente encontrarCliente(@PathVariable("cedula") int cedula) {
		return clienteService.encontrarCliente(cedula);
	}
	
	@PostMapping
	public Cliente crearCliente (@RequestBody Cliente cliente) {
		return clienteService.guardarCliente(cliente);
	}
	
	@PutMapping("/{cedula}")
	public Cliente actualizarCliente(@PathVariable("cedula") int cedula, @RequestBody Cliente cliente) {
		return clienteService.actualizarCliente(cedula, cliente);
	}
	
	@DeleteMapping("/{cedula}")
	public boolean eliminarCliente(@PathVariable("cedula") int cedula) {
		return clienteService.eliminarCliente(cedula);
	}
	
	
	

}
