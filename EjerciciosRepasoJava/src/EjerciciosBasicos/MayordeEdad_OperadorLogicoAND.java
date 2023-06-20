package EjerciciosBasicos;

import java.util.Scanner;

public class MayordeEdad_OperadorLogicoAND {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Digite su edad");
		int edad= in.nextInt();
		if (edad>=0 & edad<=5) {
			System.out.println("Su edad es "+edad+" años, es infante");
			
		} else if(edad>5 & edad<18) {
			System.out.println("Su edad es "+edad+" años, es adolescente");
		}
	
		else if (edad>=18 & edad<60) {
			System.out.println("Su edad es "+edad+" años, es adulto");
				
			}
		else {
			System.out.println("Su edad es "+edad+" años, es adulto mayor");
		}
		in.close();
	}

}
