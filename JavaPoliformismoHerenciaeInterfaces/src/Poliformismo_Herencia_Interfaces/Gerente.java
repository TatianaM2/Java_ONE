package Poliformismo_Herencia_Interfaces;

public class Gerente extends Funcionario implements Autenticable {

private AutenticacionUtil util;
	
	public Gerente() {
		this.util= new AutenticacionUtil();
	}
 
	
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return 2000;
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
