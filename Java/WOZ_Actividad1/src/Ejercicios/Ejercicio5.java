package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String usuario = "sara", contraseña = "sarita", dato1 , dato2;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		
		dato1 = leer.nextLine();
		
		while (!dato1.equals(usuario)) {
			System.out.println("Usuario incorrecto, pruebe otra vez:");
			dato1 = leer.nextLine();
		}
			
		System.out.println("Contraseña: ");
		
		dato2 = leer.nextLine();
		
		while (!dato2.equals(contraseña)) {
			System.out.println("Contraseña incorrecta, pruebe otra vez:");
			dato2 = leer.nextLine();
			
		}
		
		System.out.println("Usuario y contraseñas correctas, bienvenido a la aplicación");
		
		leer.close();
	
			
			
			
		
				
	}

}
