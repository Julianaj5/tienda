package com.accenture;


import com.accenture.models.Pedido;
import com.accenture.service.PedidoService;

public class TestPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1,123, 1, 75000);
		Pedido pedido1 = new Pedido(2,456, 1, 6000);
	
		PedidoService ps = new PedidoService();	
	

		System.out.println("---------------------------");	
		System.out.println("Factura No.:"+pedido.getId());
		System.out.println("CC Cliente.:"+pedido.getCedulaCliente());
		System.out.println("Total a pagar:"+ps.calcularTotal(pedido.getTotalPedido()));
		
		System.out.println("---------------------------");	
		System.out.println("Factura No.:"+pedido1.getId());
		System.out.println("CC Cliente.:"+pedido1.getCedulaCliente());
		System.out.println("Total a pagar:"+ps.calcularTotal(pedido1.getTotalPedido()));
		
		
		

	}

}
