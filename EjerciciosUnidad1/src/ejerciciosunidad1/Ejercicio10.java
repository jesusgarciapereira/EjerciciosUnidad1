package ejerciciosunidad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Declaración de las variables
		final double IVA = 0.21;
		double precio, precioIVA;
		
		Scanner sc = new Scanner(System.in);

		sc.useLocale(Locale.US);

		// Instrucciones
		System.out.println("Introduzca el precio");
		precio = sc.nextDouble();

		precioIVA = precio + precio * IVA;
		System.out.println("Éste es el precio con el IVA incluído: " + precioIVA + "€");

		// Cerramos el Scanner
		sc.close();
	}

}
