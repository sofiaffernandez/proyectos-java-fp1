package Ejercicios;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir todos los números del 100 al 0 de 7 en 7. 
		//Al final mostrar las siguientes Estadísticas.
			//Cuantos números has escrito: acumulador
			//Cuanto suman los números escritos: suma de cada uno
			//Cuantos de estos números son pares: que el % de 0

		//declaramos el acumulador, suma y pares
		int acumulador = 0;
		int suma = 0;
		int pares = 0;
		
		//hacemos un bucle desde 100 de 7 en 7
		for(int i = 100; i >= 0; i -= 7){
			acumulador++;
			suma += i;  
			//tenemos que hacer una logica para saber si son pares
			if(i%2 == 0){
				pares++;
			}
		}
		//sacamos x consola el resultado
		System.out.println("Hemos escrito " + acumulador + " numeros");
		System.out.println("La suma de todos es " + suma);
		System.out.println("De todos los anteriores, " + pares + " son pares");
	
	}

}
