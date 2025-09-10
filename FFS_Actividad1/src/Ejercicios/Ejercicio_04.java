package Ejercicios;
import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer números hasta que se introduzca un cero.
		//Para cada uno indicar si es par o impar. 
		//Al final mostrar las siguientes Estadísticas:
			//cuantos son pares e impares
			//cuanto suman los pares y cuanto los impares.
		
		//declarar todos lo necesario
		//numero introduccido
		int numero;
		
		//cantidad de pares e impartes
		int contadorPar = 0;
		int contadorImpar = 0;
		
		//suma de esos numeros pares e impares
		int sumaPar = 0;
		int sumaImpar = 0;
		
		//declarar introducir numero
		Scanner numeroIntroducido = new Scanner(System.in);

		//leer hasta, un hacer hasta, do while
		do {
			//introducir numero
			System.out.print("Introduce un número ");
	        numero = numeroIntroducido.nextInt();
			
			if(numero % 2 == 0){
				contadorPar++;
				sumaPar += numero;
				System.out.println("El numero " + numero +" es par");
			}else{
				contadorImpar++;
				sumaImpar += numero;
				System.out.println("El numero " + numero +" es impar");
			}
			
			
		}while (numero != 0); 
		
	

    System.out.println("El contador de números pares es " + contadorPar);
    System.out.println("El contador de números impareses " + contadorImpar);
    System.out.println("La suma de números pares es " + sumaPar);
    System.out.println("La suma de números impares es " + sumaImpar);
    
    numeroIntroducido.close();
	}
	
}
