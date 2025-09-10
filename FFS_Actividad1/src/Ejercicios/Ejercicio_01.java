package Ejercicios;
import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir una nota de 0 a 10 y mostrarla de la forma:
		//Insuficiente, Suficiente, Bien, Notable y sobresaliente. 
		//Si la nota introducida no está en el rango mostrar el mensaje “Nota errónea”.
		/* ESTA OPCIÓN SOLO VALE PARA NÚMEROS ENTEROS, SI ENTRUDCEN DE 0 A 10 SIN DECIMALES
		// Clase notaintroduccida
        Scanner notaIntroducida = new Scanner(System.in);
        
        //introduccir nota
        System.out.print("Introduce una nota del 0 al 10");
        int nota = notaIntroducida.nextInt();

 
		//ver que nota es
        switch(nota){
        	case 1: case 2: case 3: case 4:
        		System.out.println("Insuficiente");
        		break;
        	case 5:
        		System.out.println("Suficiente");
        		break;
        	case 6:
        		System.out.println("Bien");
        		break;
        	case 7: case 8:
        		System.out.println("Notable");
        		break;
        	case 9: case 10:
        		System.out.println("Sobresaliente");
        		break;
        default:
        	System.out.println("Nota errónea");
	}
        //ceerar el objeto
        notaIntroducida.close();
        */
        
		//clase notaIntroducida
        Scanner notaIntroducida = new Scanner(System.in);
        //introduccir nota x consola
        System.out.print("Introduce una nota del 0 al 10 ");
        //declarar el tipo de dato
        double nota = notaIntroducida.nextDouble();

        //revisar con decimales la nota
        if (nota >= 0 && nota < 5) {
            System.out.println("Insuficiente");
        }  
        if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente");
        } 
        if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        }  
        if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } 
        if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } 
        if (nota < 0 || nota > 10) {
            //si la nota no está en el rango
            System.out.println("Nota errónea");
        }
       //cerrar el objeto 
       notaIntroducida.close();
     }
 }
