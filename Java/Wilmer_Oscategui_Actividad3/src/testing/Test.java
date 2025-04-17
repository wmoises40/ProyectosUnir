package testing;

import java.time.LocalDate;

import javabean.Banco;
import javabean.Cliente;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

public class Test {

	public static void main(String[] args) {
		
		//dos objetos de la clase pais
		Pais pais1 = new Pais(5678, "España");
		Pais pais2 = new Pais(1234, "Argentina");
		//dos objetos de banco
		Banco banco1 = new Banco(777, "Banquito", pais1);
		Banco banco2 = new Banco(222, "Bancote", pais2);
		//dos tarjetas de cada banco
		TarjetaBancaria tarjeta1 = new TarjetaBancaria(987654321, 2029, 9, 765, banco1);
		TarjetaBancaria tarjeta2 = new TarjetaBancaria(896745231, 2030, 10, 555, banco2);
		//direccion
		DireccionCliente direccion = new DireccionCliente("calle pepito 22", "localidad66", "madrid", pais1);
		//cliente con su tarjeta y direccion
		Cliente cliente1 = new Cliente("212", "Juanito", "juanito@gmail.com", LocalDate.of(2000, 10, 2), direccion, tarjeta1);
		//pedido con su cliente
		Pedido pedido1 = new Pedido(999, LocalDate.of(2025, 1, 29), "enviado", cliente1 );
		//factura con pedido
		Factura factura = new Factura("4573", "factura del pedido1", LocalDate.of(2025, 1, 29), pedido1);
		
		//obteniendo informacion con la factura
		System.out.println("Descripcion: " + factura.getDescripcion());
		System.out.println("Fecha del pedido: " + factura.getPedido().getCreateAt());
		System.out.println("Estado del pedido: " + factura.getPedido().getEstado());
		System.out.println("Nombre del cliente: " + factura.getPedido().getCliente().getNombre());
		System.out.println("Direccion del cliente: " + factura.getPedido().getCliente().getDireccion().getDireccion());
		System.out.println("Numero de tarjeta: " + factura.getPedido().getCliente().getTarjeta().getNumero());
		System.out.println("Titular: " + factura.getPedido().getCliente().getNombre());
		System.out.println("Banco de la tarjeta: " + factura.getPedido().getCliente().getTarjeta().getBanco().getNombre());
		System.out.println("Pais del banco: " + factura.getPedido().getCliente().getTarjeta().getBanco().getPais().getNombre());
		System.out.println("Pais del cliente: " + factura.getPedido().getCliente().getDireccion().getPais().getNombre());
		
		


	}

}
