package EjerciciosBasicos;

import java.util.Scanner;

public class DiaSemana_SwitchCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite un numero y obtendras el dia de la semana");
		int dia = in.nextInt();
					
			switch(dia) {
			case 1 :
				System.out.println("Es Lunes");
				break;
			case 2 :
				System.out.println("Es Martes");
				break;	
			case 3 :
				System.out.println("Es Miercoles");
				break;
			case 4 :
				System.out.println("Es Jueves");
				break;
			case 5 :
				System.out.println("Es Viernes");
				break;
			case 6 :
				System.out.println("Es Sabado");
				break;
			case 7 :
				System.out.println("Es Domingo");
				break;
			default:
				System.out.println("Dia invalido");
			
			}
			
			
		in.close();	
		
	}
}
