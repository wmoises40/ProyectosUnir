package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero, pares = 0, impares = 0, sumaPares = 0, sumaImpares = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Hola, introduce un número: ");
		
		numero = leer.nextInt();
		
		while (numero != 0) {
			
			if (numero % 2 == 0) {
				
				pares++;
				sumaPares += numero;
			}
			else {
				
				impares++;
				sumaImpares += numero;
			}
			
			System.out.println("Otro número (escribir 0 para cerrar): ");
			
			numero = leer.nextInt();
			
		}
			
		leer.close();
		
		System.out.println("La cantidad de números pares es: " + pares);
		
		System.out.println("La cantidad de números impares es: " + impares);
		
		System.out.println("La suma de los números impares es: " + sumaImpares);
		
		System.out.println("La suma de los números pares es: " + sumaPares);

	}

}
