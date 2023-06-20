package Productos;

import java.util.Scanner;

public class PrincipalProductos {
 public static void main(String[] args) {
	 
	 Scanner Producto=new Scanner(System.in);
		
     System.out.println("Digite el nombre del producto");
     String nombre=Producto.nextLine();
             
     System.out.println("Digite el codigo del producto");
     String codigo=Producto.nextLine();
     
     System.out.println("Digite la categoria del producto");
     String categoria=Producto.nextLine();
     
     System.out.println("Digite el laboratrorio del producto");
     String laboratorio=Producto.nextLine();
     
     System.out.println("Digite si es cotizante true o false");
     boolean cotizante=Producto.nextBoolean();
     
    Producto producto = new Producto(nombre,codigo,categoria,laboratorio,cotizante);
     producto.info();
     
     Producto.close();
}
}
