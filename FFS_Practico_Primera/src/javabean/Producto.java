package javabean;

public class Producto {
	/*
	 * Código de barras: long,
		descripción: String,
		precioUnitario: double
		cantidadStock: int
		talla: String
		color: String
	 */
	
	private long codigoBarras;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	//constrcutor con todo
	public Producto(long codigoBarras, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoBarras = codigoBarras;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}

	//constructor por defecto con nada
	public Producto() {
		super();
	}

	//getter and setter
	
	public long getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	//generamos el tostring
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	
	//metodos propios
	
	//precioConIva, % de iva se pasa sumamos ese iva al precio anterior
	public double precioConIva(int iva) {
        return precioUnitario + (precioUnitario * iva / 100);
    }
	
	//aumentar stock en cantidad dada
	public void aumentarStock(int cantidad) {
        cantidadStock += cantidad;
    }
	
	//disminuir el stock con cantidad dada, revisar que no baje más de 0
	public boolean disminuirStock(int cantidad) {
		if (cantidad > cantidadStock) {
			return false;
	    } else {
	    	cantidadStock -= cantidad;
	    	return  true;
	    }
			
    }
	
	//aplicar el precio en función de la talla
	public double precioAplicado() {
	    switch (talla) {
	        case "XS":
	            return precioUnitario;        
	        case "S": case "M":case "L":case "XL":
	            return precioUnitario * 1.03;
	        case "XXL": case "XXXL":
	            return precioUnitario * 1.04;
	        default:
	        	return 0;
	    }
	}

}
