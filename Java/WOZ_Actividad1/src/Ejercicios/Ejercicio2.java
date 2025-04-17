package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		int suma = 0, producto = 1;
		 
		for (int i = 1; i < 20; i+=2) {
			System.out.println(i);
			suma += i;
			producto *= i;
		}
			
		System.out.println("La suma de los primero 10 números impares es: " + suma);
		System.out.println("El producto de los primeros 10 número impares es: " + producto);
		
		

	}

}
