		/*
		 * Crear una calculadora que pueda sumar, restar, multiplicar, 
		 * y dividir 2 n�meros.
		 * La calculadora debe pedir los dos n�meros y posterior a eso 
		 * preguntar que operacion se quiere realizar, el men� es el siguiente:
		 * 1. Suma
		 * 2. Resta
		 * 3. Multiplicaci�n
		 * 4. Divisi�n
		 * 
		 * Al final debe mostrar los resultados de la operaci�n y la operaci�n
		 * que se realiz�.
		 */


import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Solicitamos el primer n�mero
		System.out.println ("Por favor introduce el primer n�mero:");
		Scanner numero1 = new Scanner (System.in);		
		float numeroingresado1 = numero1.nextFloat();
		
		//Solicitamos el segundo n�mero
		System.out.println ("Por favor introduce el segundo n�mero");
		Scanner numero2 = new Scanner (System.in);		
		float numeroingresado2 = numero2.nextFloat();
		
		//Solicitamos elegir la operaci�n a realizar
		System.out.println ("Ahora por favor elige la operaci�n que quieres realizar:");
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
					System.out.println ("La multiplicaci�n de " + numeroingresado1 + " x " + numeroingresado2+ " es igual a: " + multiplicacion);
					break;
					
				case 4: //Operacion division
					float division = numeroingresado1 / numeroingresado2;
					System.out.println ("La divisi�n de " + numeroingresado1 + " / " + numeroingresado2+ " es igual a: " + division);
					break;
					
				default:
				    System.out.println("La opci�n no es correcta, debes seleccionar un n�mero del 1 al 4");
				    break;
				}
	}
}


	