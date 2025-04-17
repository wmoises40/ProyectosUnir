package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Hola, introduce un número del 0 al 10:");
		
		numero = leer.nextInt();
		
		leer.close();
		
		switch(numero) {
		case 0: 
		case 1:
		case 2:
		case 3:
		case 4: 
			System.out.println("Insuficiente");
			break;
		case 5:
		case 6:
			System.out.println("Suficiente");
			break;
		case 7:
		case 8:
			System.out.println("bien");
			break;
		case 9:
			System.out.println("Notable");
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota Errónea");
		
		
		}
	}

}
