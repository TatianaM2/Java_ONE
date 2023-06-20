package EjerciciosBasicos;

import java.util.Scanner;

public class Condicional_Elif {
	public static void main(String[] args) {
		
		Scanner  in= new Scanner(System.in);
	System.out.println("Digite el dia de la semana");
	int dia= in.nextInt();
	
	if (dia==1) {
		System.out.println("Es Lunes");
	}
	else if (dia==2) {
		System.out.println("Es Martes");
	}
	else if (dia==3) {
		System.out.println("Es Miercoles");
	}
	else if (dia==4) {
		System.out.println("Es Jueves");
	}
	else if (dia==5) {
		System.out.println("Es Viernes");
	}
	else {
		System.out.println("No existe");
	}
	}

}
