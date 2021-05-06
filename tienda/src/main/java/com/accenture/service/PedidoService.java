package com.accenture.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.models.Cliente;
import com.accenture.models.Pedido;

@Service
public class PedidoService {
	private ClienteService clienteService;
	private PedidoService ps;

	private List<Pedido> pedidos;
	private List<Cliente> clientes;

	public PedidoService() {
		pedidos = new ArrayList<>();
		pedidos.add(new Pedido(1, 123, 1, calcularTotal(0)));
		

	}

	public List<Pedido> listarPedidos() {
		return pedidos;
	}

	// CrearPedido
	public Pedido crearPedido(Pedido pedido) {
		pedidos.add(pedido);
		return pedido;

	}

	// CalcularImpuesto
	public double calcularTotal(double subtotal) {
		double iva = 0;
		double domi = 0;
		double total = 0;
		iva = (subtotal * 19) / 100;
		subtotal = subtotal + iva;
		if (subtotal > 70000 && subtotal <= 100000) {
			domi = 5000;
		} else if (subtotal > 100000) {
			domi = 0;
		} else if (subtotal < 70000) {
			domi = 5000;
		}
		total = subtotal + domi;

		return total;
	}
	



	// GenerarFactura
	public Pedido factura(int id) {
		for (Pedido pedido : pedidos) {
			if (pedido.getId() == id) {
				double total = calcularTotal(pedido.getTotalPedido());
				pedido.setTotalPedido(total);
				return pedido;
			}
		}
		return null;
	}

	// ActualizarPedido

	public Pedido actualizarPedido(int id, Pedido pedido) {
		int index = 0;
		for (Pedido p : pedidos) {
			if (p.getId() == id) {
				pedido.setId(id);
		
				pedidos.set(index, pedido);
			}
		}
		return pedido;
	}

	// EliminarPedido

	public boolean eliminarPedido(int id) {
		for (Pedido p : pedidos) {
			if (p.getId() == id) {
				return pedidos.remove(p);
			}
		}
		return false;
	}

}
