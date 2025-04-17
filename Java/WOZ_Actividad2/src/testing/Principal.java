package testing;

import javabean.ClaseFiesta;

public class Principal {

	public static void main(String[] args) {
	
		//objeto con el constructor vacio
		ClaseFiesta fiesta1 = new ClaseFiesta(); 
		ClaseFiesta fiesta2 = new ClaseFiesta();
		//objeto con el constructor con parametros
		ClaseFiesta fiesta3 = new ClaseFiesta("cumpleaños", "calle pepito123", "11/09/2077", "21:00", 100, 80, 90);
		
		//dandoles valores al objeto "fiesta1" con el set
		fiesta1.setTipoFiesta("Disfraces");
		fiesta1.setInvitados(40);
		fiesta1.setHora("16:00");
		fiesta1.setFecha("18/08/2033");
		fiesta1.setDireccion("calle juanito343");
		fiesta1.setBocadillos(60);
		fiesta1.setBebidas(99);
		
		//dandoles valores al objeto "fiesta2" con el set
		fiesta2.setTipoFiesta("Aniversario");
		fiesta2.setInvitados(88);
		fiesta2.setHora("19:00");
		fiesta2.setFecha("13/03/2029");
		fiesta2.setDireccion("calle jorgito666");
		fiesta2.setBocadillos(210);
		fiesta2.setBebidas(255);
		
		System.out.println("________________");
		//utilizando los metodos creados para el primer objeto
		fiesta1.invitar();
		fiesta1.invitar(5);
		fiesta1.cancelarInvitacion();
		fiesta1.cancelarInvitacion(3);
		System.out.println("Precio de fiesta1:" + fiesta1.precioFiesta());
		System.out.println(fiesta1.toString());
		
		System.out.println("________________");
		//utilizando los metodos creados para el segundo objeto
		fiesta2.invitar();
		fiesta2.invitar(7);
		fiesta2.cancelarInvitacion();
		fiesta2.cancelarInvitacion(6);
		System.out.println("Precio de fiesta2:" + fiesta2.precioFiesta());
		System.out.println(fiesta2.toString());
		
		System.out.println("________________");
		//utilizando los metodos creados para el tercer objeto
		fiesta3.invitar();
		fiesta3.invitar(11);
		fiesta3.cancelarInvitacion();
		fiesta3.cancelarInvitacion(5);
		System.out.println("Precio fiesta3:" + fiesta3.precioFiesta());
		System.out.println(fiesta3.toString());
		
		
}
}