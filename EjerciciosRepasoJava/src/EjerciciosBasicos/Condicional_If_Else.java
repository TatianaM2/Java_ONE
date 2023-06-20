package EjerciciosBasicos;

import java.util.Scanner;

public class Condicional_If_Else {
	public static void main(String[] args) {
       double descuento=0.10;
       double total=0;
		Scanner in= new Scanner(System.in);
		
		System.out.println("Digite el valor de la compra");
		double compra=in.nextDouble();
		
		if (compra>=10000) {
			total= compra-compra*descuento;
			System.out.println("Su compra de $ "+compra+ " tiene un descuento de: "
					+descuento*100+ " % el valor a pagar es: $ "+total);		
		} else {
			total=compra;
			System.out.println("Su compra de $ "+compra+ "  no tiene un descuento de: "
					+descuento*100+ " % el valor a pagar es: $ "+total);
		}
		
		in.close();
	}
}
