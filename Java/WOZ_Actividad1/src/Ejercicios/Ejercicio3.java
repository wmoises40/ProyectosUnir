package Ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero = 100, totales = 0, suma = 0, pares = 0; 
		
		while (numero >= 0) {
			
			System.out.println(numero);
			
			totales++;
			
			if (numero % 2 == 0) {
				pares++;
			}
		
			suma += numero;
			
			numero-=7;
			
			
		}
			
		System.out.println("los números totales son: " + totales);
		System.out.println("la suma de los números son: " + suma);
		System.out.println("los números pares son: " + pares);
	}

}
