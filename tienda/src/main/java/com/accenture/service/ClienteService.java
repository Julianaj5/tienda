package com.accenture.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.models.Cliente;


@Service
public class ClienteService {
	
	//ListadoClientes
	
	private List<Cliente> clientes;
	
	public ClienteService() {
		clientes = new ArrayList<>(); 
		clientes.add(new Cliente(123,"Karen","casa 1"));
		clientes.add(new Cliente(456,"Juan","casa 2"));
		clientes.add(new Cliente(789,"Juliana","casa 3"));
	}
	
	public List<Cliente> listarCliente(){
		return clientes;
	}
	
	//BuscarCliente
	public Cliente encontrarCliente(int cedula) {
		for (Cliente cliente : clientes) {
			if (cliente.getCedula()==cedula) {
				return cliente;
			}
		}
		return null;
	}
	
	
	
	//CrearCliente
	public Cliente guardarCliente(Cliente cliente) {
		clientes.add(cliente);
		return cliente;
	}
	
	//ActualizarCliente
	
	public Cliente actualizarCliente(int cedula, Cliente cliente) {
		int index=0;
		for(Cliente c: clientes) {
			if (c.getCedula()==cedula) {
				cliente.setCedula(cedula);
				clientes.set(index, cliente);
			}
		}
		return cliente;
	}
	
	//EliminarCliente
	
	public boolean eliminarCliente(int cedula) {
		for(Cliente c: clientes) {
			if (c.getCedula()==cedula) {
				return clientes.remove(c);
				
			}
		}
		return false;
	}

}
