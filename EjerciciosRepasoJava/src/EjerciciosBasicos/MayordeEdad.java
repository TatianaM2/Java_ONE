package EjerciciosBasicos;

import java.util.Scanner;

public class MayordeEdad {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Digite la edad de la persona");
		int edad=in.nextInt();
		if(edad>=18) {
			System.out.println("Su edad es: "+edad+" años es mayor de edad");
		}
		else {
			System.out.println("Su edad es: "+edad+" años es menor de edad");
		}
		in.close();
	}
}
