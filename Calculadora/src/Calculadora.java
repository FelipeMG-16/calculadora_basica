		/*
		 * Crear una calculadora que pueda sumar, restar, multiplicar, 
		 * y dividir 2 números.
		 * La calculadora debe pedir los dos números y posterior a eso 
		 * preguntar que operacion se quiere realizar, el menú es el siguiente:
		 * 1. Suma
		 * 2. Resta
		 * 3. Multiplicación
		 * 4. División
		 * 
		 * Al final debe mostrar los resultados de la operación y la operación
		 * que se realizó.
		 */


import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Solicitamos el primer número
		System.out.println ("Por favor introduce el primer número:");
		Scanner numero1 = new Scanner (System.in);		
		float numeroingresado1 = numero1.nextFloat();
		
		//Solicitamos el segundo número
		System.out.println ("Por favor introduce el segundo número");
		Scanner numero2 = new Scanner (System.in);		
		float numeroingresado2 = numero2.nextFloat();
		
		//Solicitamos elegir la operación a realizar
		System.out.println ("Ahora por favor elige la operación que quieres realizar:");
		System.out.println ("1 SUMAR");
		System.out.println ("2 RESTAR");
		System.out.println ("3 MULTIPLICAR");
		System.out.println ("4 DIVIDIR");
		
		Scanner operacion = new Scanner (System.in);
		int eleccion = operacion.nextInt();
				
				switch (eleccion) {
				
				case 1: //Operacion suma
					float suma = numeroingresado1 + numeroingresado2;
					System.out.println ("La suma de " + numeroingresado1 + " + " + numeroingresado2+ " es igual a: " + suma);
					break;
					
				case 2: //Operacion resta
					float resta = numeroingresado1 - numeroingresado2;
					System.out.println ("La resta de " + numeroingresado1 + " - " + numeroingresado2+ " es igual a: " + resta);
					break;
					
				case 3: //Operacion multiplicacion
					float multiplicacion = numeroingresado1 * numeroingresado2;
					System.out.println ("La multiplicación de " + numeroingresado1 + " x " + numeroingresado2+ " es igual a: " + multiplicacion);
					break;
					
				case 4: //Operacion division
					float division = numeroingresado1 / numeroingresado2;
					System.out.println ("La división de " + numeroingresado1 + " / " + numeroingresado2+ " es igual a: " + division);
					break;
					
				default:
				    System.out.println("La opción no es correcta, debes seleccionar un número del 1 al 4");
				    break;
				}
	}
}


	