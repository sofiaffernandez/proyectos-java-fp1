package Ejercicios;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Diseñar un programa que muestre el producto (resultado multiplicar) 
		//y la suma de los 10 primeros números impares 
		
		//declaramos el numero que nos dara la suma, acumulado
		int suma = 0;
		//declaramos el numero que nos dara el producto
		int producto = 1;
		
		//hacemos un bucle por donde iran pasando todos los números impares desde el 1, sumando 2, hasta el 10
		for (int i = 1; i < 10; i += 2) {
            suma += i;         
            producto *= i;      
        }
		
		//sacamos x consola el resultado
		System.out.println("La suma es " + suma);
        System.out.println("El producto es " + producto);
	}

}
