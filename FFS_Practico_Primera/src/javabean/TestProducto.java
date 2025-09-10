package javabean;


public class TestProducto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea un Producto vacío, y con los setter le das valor a cada atributo de instancia.
		Producto producto1 = new Producto();
	    producto1.setCodigoBarras(123456789);
	    producto1.setDescripcion("Pantalón vaquero");
	    producto1.setPrecioUnitario(25.90);
	    producto1.setCantidadStock(20);
	    producto1.setTalla("M");
	    producto1.setColor("Negro");
	    
	    //Crea Productos usando el constructor con todo.
	    Producto producto2 = new Producto(987654321, "Pantalón corto", 19.90, 10, "L", "Azul");
	    Producto producto3 = new Producto(01234567, "Falda vaquera", 29.90, 5, "L", "Azul");

	    
	    //metodos de IVA
	    System.out.println("Metodo IVA");
	    System.out.println("Precio sin IVA para " + producto1.getDescripcion() + " es " + producto1.getPrecioUnitario() +"€");
	    System.out.println("Precio con el 21% de IVA para " + producto1.getDescripcion() + " es " + producto1.precioConIva(21) +"€");
	    System.out.println("Precio sin IVA para " + producto2.getDescripcion() + " es " + producto2.getPrecioUnitario() +"€");
	    System.out.println("Precio con el 21% de IVA para " + producto2.getDescripcion() + " es " + producto2.precioConIva(21) +"€");
	    System.out.println("Precio sin IVA para " + producto3.getDescripcion() + " es " + producto3.getPrecioUnitario() +"€");
	    System.out.println("Precio con el 21% de IVA para " + producto3.getDescripcion() + " es " + producto3.precioConIva(21) +"€");

	    
	    //METODOS DE AUMENTAR STOCK
	    System.out.println("Metodo umentar stock");
	    System.out.println("Antes de aumentar el stock hay "  + producto1.getCantidadStock() + " " + producto1.getDescripcion());
	    producto1.aumentarStock(5);
	    System.out.println("Después de aumentar el stock hay "  + producto1.getCantidadStock() + " " + producto1.getDescripcion());
	    
	    System.out.println("Antes de aumentar el stock hay "  + producto2.getCantidadStock() + " " + producto2.getDescripcion());
	    producto2.aumentarStock(8);
	    System.out.println("Después de aumentar el stock hay "  + producto2.getCantidadStock() + " " + producto2.getDescripcion());
	    
	    System.out.println("Antes de aumentar el stock hay "  + producto3.getCantidadStock() + " " + producto3.getDescripcion());
	    producto3.aumentarStock(2);
	    System.out.println("Depués de aumentar el stock hay "  + producto3.getCantidadStock() + " " + producto3.getDescripcion());
	    
	    //METODOS DE DISMINUIRsTOCK
	    System.out.println("Metodo disminuir stock");
	    System.out.println("Antes de dsiminuir el stock hay "  + producto1.getCantidadStock() + " " + producto1.getDescripcion());
	    producto1.disminuirStock(10);
	    System.out.println("Después de disminuir el stock hay "  + producto1.getCantidadStock() + " " + producto1.getDescripcion());
	    
	    System.out.println("Antes de disminuir el stock hay "  + producto2.getCantidadStock() + " " + producto2.getDescripcion());
	    producto2.disminuirStock(4);
	    System.out.println("Después de disminuir el stock hay "  + producto2.getCantidadStock() + " " + producto2.getDescripcion());
	    
	    System.out.println("Antes de disminuir el stock hay "  + producto3.getCantidadStock() + " " + producto3.getDescripcion());
	    producto3.disminuirStock(5);
	    System.out.println("Depués de disminuir el stock hay "  + producto3.getCantidadStock() + " " + producto3.getDescripcion());
	    
	    
	    //probar a quitar más de los que hay
	    System.out.println("¿Se ha completado la operación de disminuir más cantidad de la que hay?" + producto3.disminuirStock(3) + ". Se mantiene el stock anterior de " + producto3.getCantidadStock());
	    
	    
	    
	    //METODO precioAplicado() 
	    //GENERAR AARRAY
	    //String [] tallas = {"XL", "S", "M", "L", "XL", "XXL", "XXXL"};
	    System.out.println("Metodo precio aplicado");
	    producto1.setTalla("XS");
	    System.out.println("El precio de " + producto1.getDescripcion() + " de la talla " + producto1.getTalla() + " es "+ producto1.precioAplicado() + " más IVA");
	    producto1.setTalla("M");
	    System.out.println("El precio de " + producto1.getDescripcion() + " de la talla " + producto1.getTalla() +" es "+ producto1.precioAplicado() + " más IVA");
	    producto1.setTalla("XL");
	    System.out.println("El precio de " + producto1.getDescripcion() + " de la talla " + producto1.getTalla() +" es "+ producto1.precioAplicado() + " más IVA");
	    producto1.setTalla("XXXL");
	    System.out.println("El precio de " + producto1.getDescripcion() + " de la talla " + producto1.getTalla() +" es "+ producto1.precioAplicado() + " más IVA");
	}
}