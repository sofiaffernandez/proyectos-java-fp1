package Ejercicios;
import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedimos por pantalla un nombre y una contraseña:
		//si el nombre coincide con “sara”, preguntamos por la contraseña y si coincide con “sarita”, escribimos el mensaje “usuario y contraseña correctas, bienvenido a la aplicación”
		//Si el nombre NO es “sara” Escribimos usuario incorrecto”
		//Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”
		
		Scanner nombreIntroducido = new Scanner(System.in);
        //introduccir nombre x consola
        System.out.print("Introduce el nombre ");
        //declarar que el nombre es string
        String nombre = nombreIntroducido.nextLine();

        if(nombre.equals("sara")){
        	Scanner contraseñaIntroducida = new Scanner(System.in);
            System.out.print("Introduce la contraseña ");
            String contraseña = contraseñaIntroducida.nextLine();
            
            if (contraseña.equals("sarita")) {
                System.out.println("Usuario y contraseña correctas, bienvenido a la aplicación.");
                contraseñaIntroducida.close();
            } else {
                System.out.println("Contraseña incorrecta");
                nombreIntroducido.close();
            }
        } else {
        	System.out.print("Usuario incorrecto");
        }
        
        nombreIntroducido.close();

        
	}
     
        
}


