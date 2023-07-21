package com.ByteBank.Modelo;

public class Cliente implements Autenticable {
	private String nombre;
	private String documento;
	private String telefono;
	private String profesion;
	private String contrasena;
	private AutenticacionUtil util;

	public Cliente() {
		this.util = new AutenticacionUtil();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
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
