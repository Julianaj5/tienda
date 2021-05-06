package com.accenture.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.models.Cliente;
import com.accenture.models.Pedido;

@Service
public class PedidoService {
	private ClienteService clienteService;

	private List<Pedido> pedidos;

	// BuscarCliente
	public Cliente encontrarCliente(int cedula) {
		if (clienteService.listarCliente()!= null) {
			for (int i = 0; i < clienteService.listarCliente().size(); i++) {
				if (clienteService.listarCliente().get(i).getCedula() == cedula) {
					return clienteService.listarCliente().get(i);
				}
			}
		}
		
		return null;
	}

	// CrearPedido
	public Pedido crearPedido(Pedido pedido) {
		pedidos.add(pedido);	
		return pedido;

	}
	
	//CalcularImpuesto
	public List<Pedido> calcularTotal(double subtotal) {
		double iva = 0;
		double domi = 0;
		double total=0;
		iva= (subtotal*19)/100;
		subtotal= subtotal+iva;
		if (subtotal>70000 && subtotal<=100000) {
			domi = 5000;
		}else if (subtotal>100000) {
			domi=0;
		}
		total=subtotal+domi;
		
		pedidos.add(new Pedido(1,1,1,total));
		return pedidos;
	}
}
