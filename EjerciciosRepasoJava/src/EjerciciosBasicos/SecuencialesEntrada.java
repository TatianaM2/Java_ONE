package EjerciciosBasicos;

import java.util.Scanner;

public class SecuencialesEntrada {
	public static void main(String[] args) {
			
		Scanner in= new Scanner(System.in);
		
		System.out.println("Ingrese la edad de la persona: ");
		int edad=in.nextInt();
		
		System.out.println("Ingrese el nombre de la persona");
		String nombre=in.next();
		
		System.out.println("El nombre de la persona es: "+ nombre+ " y tiene: "+edad+ " años" );
		
		in.close();
	}

}
