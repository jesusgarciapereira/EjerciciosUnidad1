package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de las variables
		double nota1;
		double nota2;
		Scanner sc = new Scanner(System.in);

		// Instrucciones
		System.out.println("Escriba cada una de sus notas");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();

		System.out.println("Su nota media es de " + (nota1 + nota2) / 2);

		// Cerramos el Scanner
		sc.close();

	}

}
