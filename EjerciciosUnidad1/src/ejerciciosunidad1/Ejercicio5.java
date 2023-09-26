package ejerciciosunidad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de las variables
		double radio;
		double longitud;
		double area;
		Scanner sc = new Scanner(System.in);
		
		//Para que puedas poner en la consola los decimales con un punto
		sc.useLocale(Locale.US);

		// Instrucciones
		System.out.println("Introduzca la longitud del radio");
		radio = sc.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("La longitud de la circunferencia es de " + longitud + " y su área es de " + area);
		
		// Cerramos el Scanner
		sc.close();
	}
}
