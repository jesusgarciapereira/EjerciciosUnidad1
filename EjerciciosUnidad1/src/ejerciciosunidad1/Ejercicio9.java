package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

		// Declaración de las variables
		int pesetas;
		double euros;
		Scanner sc = new Scanner(System.in);

		// Instrucciones
		System.out.println("Introduzca la cantidad en pesetas");
		pesetas = sc.nextInt();

		euros = pesetas / 166.386;

		System.out.println("En euros son: " + euros + "€");
		
		// Cerramos el Scanner
		sc.close();
	}
}
