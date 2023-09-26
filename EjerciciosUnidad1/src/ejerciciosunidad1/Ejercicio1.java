package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		// Declaración de la variable
		int num;
		//Scanner para leer el teclado
		Scanner sc = new Scanner (System.in);
		
		// Instrucciones
		System.out.println("Por favor, introduzca un número");
		num = sc.nextInt(); 
		System.out.println("Gracias, usted ha escrito " + num);
		
		// IMPORTANTE: Cierra siempre el Scanner
		sc.close();
	
	}

}
