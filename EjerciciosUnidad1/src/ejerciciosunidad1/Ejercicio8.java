package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		// Declaración de las variables
		String nombre;
		int edad;
		Scanner sc = new Scanner(System.in);

		// Instrucciones
		System.out.println("Escribe tu nombre");
		nombre = sc.nextLine();
		System.out.println("Dime tu edad");
		edad = sc.nextInt();

		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerramos el Scanner
		sc.close();
	}

}
