package com.ByteBank.Modelo;

public interface Autenticable {

	public void setContrasena(String contrasena);

	public boolean iniciarSesion(String contrasena);

}
