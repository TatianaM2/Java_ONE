package com.ByteBank.Modelo;

public class Administrador extends Funcionario implements Autenticable {
	private AutenticacionUtil util;

	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setContrasena(String contrasena) {
		this.setContrasena(contrasena);

	}

	@Override
	public boolean iniciarSesion(String contrasena) {
		return this.util.iniciarSesion(contrasena);

	}

}
