package testing;

import java.time.LocalDate;
import java.util.ArrayList;

import javabean.Banco;
import javabean.Cliente;
import javabean.Cliente2;
import javabean.DireccionCliente;
import javabean.Pais;
import javabean.TarjetaBancaria;

public class TestCliente2 {

	public static void main(String[] args) {
		
		Pais pais1 = new Pais(5678, "España");
		Pais pais2 = new Pais(1234, "Argentina");

		Banco banco1 = new Banco(777, "Banquito", pais1);
		Banco banco2 = new Banco(222, "Bancote", pais2);

		TarjetaBancaria tarjeta1 = new TarjetaBancaria(987654321, 2029, 9, 765, banco1);
		TarjetaBancaria tarjeta2 = new TarjetaBancaria(896745231, 2030, 10, 555, banco2);

		DireccionCliente direccion = new DireccionCliente("calle pepito 22", "localidad66", "madrid", pais1);
		
		ArrayList<TarjetaBancaria> lista = new ArrayList<TarjetaBancaria>();
		lista.add(tarjeta1);
		lista.add(tarjeta2);
		
		System.out.println("Banco: " + tarjeta1.getBanco().getNombre() + "||" + tarjeta1.getBanco().getPais().getNombre());
		System.out.println("Banco: " + tarjeta2.getBanco().getNombre() + "||" + tarjeta2.getBanco().getPais().getNombre());
		
		
		
		
		
		
		
		
	}

}
