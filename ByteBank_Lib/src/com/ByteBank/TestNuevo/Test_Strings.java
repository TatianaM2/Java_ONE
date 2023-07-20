package com.ByteBank.TestNuevo;

public class Test_Strings {

	public static void main(String[] args) {
		
		String nombre="Alura";
		System.out.println("Antes del metodo: "+nombre);
		nombre=nombre.replace("A", "a");
		nombre=nombre.concat(" cursos online");
		nombre=nombre.toUpperCase();
		System.out.println("Despues del metodo: "+nombre);
	}
}
