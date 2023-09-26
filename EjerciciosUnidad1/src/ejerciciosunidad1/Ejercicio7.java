package ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		// Declaración de las variables
		String nombre;
		String direccion;
		int telefono;
		Scanner sc = new Scanner(System.in);

		// Instrucciones
		System.out.println("Escriba su nombre");
		nombre= sc.nextLine();
		System.out.println("Escriba su dirección");
		direccion = sc.nextLine();
		System.out.println("Escriba su número de teléfono");
		telefono = sc.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		
		// Cerramos el Scanner
		sc.close();
		
	}
}
