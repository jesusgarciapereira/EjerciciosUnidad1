package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de las variables
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		// Instrucciones
		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num2 = sc.nextInt();
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		double division = (double) num1 / num2;
		
		System.out.println("La suma de los dos números es: " + suma );
		System.out.println("La resta de los dos números es: " + resta);		
		System.out.println("El producto de los dos números es: " + multiplicacion);	
		System.out.println("La división entre los dos números es: " + division);	
		
		// Cerramos el Scanner
		sc.close();
	}

}
