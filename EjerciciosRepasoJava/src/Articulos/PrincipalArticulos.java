package Articulos;

import java.util.Scanner;

public class PrincipalArticulos {
	public static void main(String[] args) {
		Scanner Articulo=new Scanner(System.in);
		
        System.out.println("Digite el nombre del articulo");
        String Nombre=Articulo.nextLine();
                
        System.out.println("Digite la marca del articulo");
        String Marca=Articulo.nextLine();
        
        System.out.println("Digite el Precio Unitario");
        Double precioUnitario=Articulo.nextDouble();
        
        System.out.println("Digite la cantidad en existencia");
        int cantidadStock=Articulo.nextInt();
        
        
        Articulos articulo = new Articulos(Nombre,Marca,precioUnitario,cantidadStock);
        articulo.informacionArticulos();
	}

}
