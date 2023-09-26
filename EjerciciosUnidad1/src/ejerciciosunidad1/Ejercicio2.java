package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Declaración de la variable
		int num;
		Scanner sc = new Scanner(System.in);

		// Instrucciones
		System.out.println("Por favor, introduzca su edad");
		num = sc.nextInt();
		System.out.println("Gracias, el año que viene usted tendrá " + (num + 1) + " años");

		// Cerramos el Scanner
		sc.close();
	}

}
