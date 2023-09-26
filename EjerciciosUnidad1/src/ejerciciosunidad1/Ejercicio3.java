package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Declaración de las variables
		int annoActual;
		int annoNacimiento;
		Scanner sc = new Scanner(System.in);

		// Instrucciones
		System.out.println("¿En qué año estamos?");
		annoActual = sc.nextInt();
		
		System.out.println("¿En qué año nació usted?");
		annoNacimiento = sc.nextInt();
		
		System.out.println("Gracias, su edad es de " + (annoActual - annoNacimiento) + " años");

		// Cerramos el Scanner
		sc.close();

	}
}
