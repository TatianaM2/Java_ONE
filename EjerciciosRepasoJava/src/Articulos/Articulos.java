package Articulos;

public class Articulos {
	
	private String Nombre;
	private String Marca;
	private double precioUnitario;
	private int cantidadStock;
	
	public Articulos(String nombre, String marca, double precioUnitario, int cantidadStock) {
		this.Nombre = nombre;
		this.Marca = marca;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
	}
	
	public double costoInventario() {
		double costo;
		costo=precioUnitario*cantidadStock;
		return costo;
				
	}
  
	public void informacionArticulos() {
		 	System.out.println("Articulo:");
	        System.out.println("Nombre:" + this.Nombre);
	        System.out.println("Marca: " + this.Marca);
	        System.out.println("Precio Unitario: " + this.precioUnitario);
	        System.out.println("Cantidad Stock: " + this.cantidadStock);
	        System.out.println("Costo de Inventario: " + this.costoInventario());
		
		
	}
}
