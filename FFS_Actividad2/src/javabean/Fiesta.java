package javabean;
/*
Enunciado 

El proyecto contará con una clase llamada Fiesta con la siguiente estructura de atributos de instancia:
private String tipoFiesta;
private String direccion;
private int bocadillos;
private int bebidas;
private int invitados;
private String fecha;
private String hora;
Todas las propiedades serán  accesibles mediante métodos get/set.
El atributo tipoFiesta indica el tipo de fiesta: infantil, cumpleaños, disfraces, etc.
La propiedad bocadillos contiene la cantidad de bocadillos que se comprarán para la fiesta. Lo mismo con las bebidas.
El ejercicio propone almacenar la fechaHora como String por simplificar el código. Si tienes ganas de investigar puedes probar a guardarlo como un objeto de la clase LocalDateTime.

constructores;
Se creará un constructor, con todos los atributos.
Se creará otro constructor que no reciba ningún parámetro.

El método toString() retornará una cadena con todos los datos de la fiesta, ponlo en la clase.

metodos propios: 
El método invitar() sumará 1 al contador de invitados.
El método cancelarInvitación() restará 1 al contador de invitados.
Se sobrecargará el método invitar(int cantidad), para añadir la cantidad de invitados a la fiesta que se desee.
Se sobrecargará el método cancelarInvitacion(int cantidad), para restar la cantidad de invitados a la fiesta que se desee.
El método precioFiesta() retornará el precio de la fiesta calculado de la siguiente forma: 5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada bocadillo. Estos valores se crearán en la clase con atributos constantes de clase.
*/

public class Fiesta {
	//generar toda la información que pide
	private String tipoFiesta;
	private String direccion;
    private int bocadillos;
    private int bebidas;
    private int invitados;
    private String fecha; 
    private String hora;
    
    
  //generar constructor con todo
    public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}
    
    //generar constructor con nada
    public Fiesta() {
		super();
	}
    
	//crear getter and setter para todos
	public String getTipoFiesta() {
		return tipoFiesta;
	}
	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getBocadillos() {
		return bocadillos;
	}
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}
	public int getBebidas() {
		return bebidas;
	}
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	//generar toString con todo
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

	//métodos propios
	//el método invitar() sumará 1 al contador de invitados, invitados ++
	public void invitar() {
		invitados++;
	}
	
	//metodo para invitar con cantidad, se le pasa una cantidad que se suma a los invitados previos
	public void invitar(int cantidad) {
       invitados += cantidad;
    }
	
	//El método cancelarInvitación() restará 1 al contador de invitados hasta 0, para no tener negativos
	public void cancelarInvitacion() {
		if (invitados > 0) {
			invitados--;
		} 
		else {
			invitados = 0;
		}
	}
	
	//metodo para cancelar invitacion con cantidad, se le resta la cantidad que se introduzca a los invitados previos, que si son menos de 0 invitados no descontamos para que no tengamos invitados negativos
	public void cancelarInvitacion(int cantidad) {
		if (cantidad > invitados) {
	        invitados = 0; 
	    } else {
	        invitados -= cantidad; 
	    }
	}
	
	//método precioFiesta() retornará el precio de la fiesta calculado de la siguiente forma: 5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada bocadillo.
	public static final int PRECIO_INVITADO;
	public static final int PRECIO_BEBIDA;
	public static final int PRECIO_BOCADILLO;
	static {
		PRECIO_INVITADO = 5;
		PRECIO_BEBIDA = 2;
		PRECIO_BOCADILLO = 3;
	}

	public int precioFiesta() {
		return (invitados * PRECIO_INVITADO) + (invitados * PRECIO_BEBIDA) + (invitados * PRECIO_BOCADILLO);
	}
	
	
}
