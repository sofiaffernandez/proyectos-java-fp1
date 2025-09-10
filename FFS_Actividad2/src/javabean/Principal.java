package javabean;
/*Crea una clase Principal (con método main) donde crearás varios objetos de la clase Fiesta, al menos dos, con cada constructor.
Pon en práctica todos los métodos que has creado (invitar, toString(), cancelarInvitación y precioFiesta). */

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Crear un objeto Fiesta utilizando el constructor vacío
        Fiesta fiesta1 = new Fiesta();
        fiesta1.setTipoFiesta("Cumpleaños");
        fiesta1.setDireccion("Calle de pruebas, 123");
        fiesta1.setBocadillos(10);
        fiesta1.setBebidas(15);
        fiesta1.setInvitados(5);
        fiesta1.setFecha("2024-11-08");
        fiesta1.setHora("21:00");
        
        //Crear un objeto Fiesta utilizando el constructor con parámetros
        Fiesta fiesta2 = new Fiesta("Aniversario", "Calle de fiestas, 321", 20, 25, 10, "2024-11-08", "16:00");
        
        //utilizar tu string para ver el contenido
        System.out.println(fiesta1.toString());
        System.out.println(fiesta2.toString());
		
        //imprimri contenido fiesta1 con los get
        System.out.println("Datos fiesta1 " );
        System.out.println("Tipo fiesta: " + fiesta1.getTipoFiesta());
        System.out.println("Dirección fiesta: " + fiesta1.getDireccion());
        System.out.println("Cantidad de bocadillos: " +fiesta1.getBocadillos());
        System.out.println("Cantidad de bebidas: " + fiesta1.getBebidas());
        System.out.println("Cantidad de invitados: " + fiesta1.getInvitados());
        System.out.println("Fecha: " + fiesta1.getFecha());
        System.out.println("Hora: " +fiesta1.getHora());

      //imprimri contenido fiesta2 con los get
        System.out.println("Datos fiesta2 " );
        System.out.println("Tipo fiesta: " + fiesta2.getTipoFiesta());
        System.out.println("Dirección fiesta: " + fiesta2.getDireccion());
        System.out.println("Cantidad de bocadillos: " + fiesta2.getBocadillos());
        System.out.println("Cantidad de bebidas: " + fiesta2.getBebidas());
        System.out.println("Cantidad de invitados: " + fiesta2.getInvitados());
        System.out.println("Fecha: " + fiesta2.getFecha());
        System.out.println("Hora: " + fiesta2.getHora());

        
        //utilizar calculo de precios
        System.out.println("Precio inicial de la fiesta1: " + fiesta1.precioFiesta() +"€");
        System.out.println("Precio inicial de la fiesta2: " + fiesta2.precioFiesta()+"€");
        
        
        // invitar sin cantidad, suma 1
        System.out.println("Invitados fiesta1 antes de invitar: " + fiesta1.getInvitados());
        fiesta1.invitar();
        System.out.println("Invitados fiesta1 despues de invitar sin cantidad: " + fiesta1.getInvitados());
        
        //inivttar con cantidad suma cantidad
        System.out.println("Invitados fiesta2 antes de invitar: " + fiesta2.getInvitados());
        fiesta2.invitar(4);
        System.out.println("Invitados fiesta2 después de invitar con cantidad (4): " + fiesta2.getInvitados());

     
        //cancelar invitacion con cantidad 
        System.out.println("Invitados fiesta1 antes de cancelar: " + fiesta1.getInvitados());
        fiesta1.cancelarInvitacion(4);
        System.out.println("Invitados fiesta1 después de cancelar con cantidad(4): " + fiesta1.getInvitados());
        
        //cancelar sin cantidad para ver la reta de 1
        System.out.println("Invitados fiesta2 antes de cancelar: " + fiesta2.getInvitados());
        fiesta2.cancelarInvitacion();
        System.out.println("Invitados fiesta2 después de cancelar sin cantidad: " + fiesta2.getInvitados());
        
        
        
        //como vienen menos invitados quitamos bocadillos y bebidas
        fiesta1.setBocadillos(2);
        fiesta1.setBebidas(4);
        System.out.println("Como ahora solo hay " + fiesta1.getInvitados() + " invitados en la fiesta1, vamos a dejar los bocadillos en " + fiesta1.getBocadillos() + " y las bebidas en " + fiesta1.getBebidas());
        
        //como vienen mas invitados ponemos bocadillos y bebidas
        fiesta1.setBocadillos(22);
        fiesta1.setBebidas(27);
        System.out.println("Como ahora hay " + fiesta2.getInvitados() + " invitados en la fiesta2, vamos a comprar " + fiesta2.getBocadillos() + " bocadillos y " + fiesta2.getBebidas() + " bebidas");
        
    
        //utilizar calculo de precios
        System.out.println("Precio final de la fiesta1: " + fiesta1.precioFiesta() +"€");
        System.out.println("Precio final de la fiesta2: " + fiesta2.precioFiesta()+"€");
        
        
        
        
        
        
        
        
        //prueba de que no tienes invitados negativos
        System.out.println("Prueba invitados negativos con invitados fiesta1 ");
        System.out.println("Invitados fiesta1: " + fiesta1.getInvitados());
        fiesta1.cancelarInvitacion(20);
        System.out.println("Invitados fiesta1 después de cancelar todos con cantidad(20): " + fiesta1.getInvitados());

        fiesta1.invitar(1);
        System.out.println("Invitados fiesta1 despues de invitar 1 para volver a probar: " + fiesta1.getInvitados());
        fiesta1.cancelarInvitacion();
        fiesta1.cancelarInvitacion();
        fiesta1.cancelarInvitacion();
        System.out.println("Invitados fiesta1 después de cancelar todos sin cantidad tres veces: " + fiesta1.getInvitados());

	}

}
