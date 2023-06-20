package Productos;

public class Producto {
	private String nombre;
	private String codigo;
	private String categoria;
	private String laboratorio;
	private boolean cotizante;
	
	public Producto(String nombre, String codigo, String categoria, String laboratorio, boolean cotizante) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.categoria = categoria;
		this.laboratorio = laboratorio;
		this.cotizante = cotizante;
	}
	
	 public float costo() {	        
		 float Precio=0;
	        if (cotizante == true) {
	            Precio = 3500;
	            //System.out.println(Precio);
	        } else  if(cotizante == false){
	            Precio = 14000;
	            //System.out.println(Precio);
	        }
	        return Precio;

	    }

	    public void info() {

	        System.out.println("---[Producto]---:");
	        System.out.println("Nombre:" + this.nombre);
	        System.out.println("Codigo: " + this.codigo);
	        System.out.println("Categoria: " + this.categoria);
	        System.out.println("Laboratorio: " + this.laboratorio);
	        System.out.println("Precio: " + this.costo());
	    }
	
	

}
