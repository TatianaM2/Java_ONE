package com.ByteBank.Modelo;

public class SistemaInterno {
	
	private  String contrasena="AluraCursos";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion=gerente.iniciarSesion(contrasena);
		
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Login Invalido");
			return false;
		}
		
	}

}
