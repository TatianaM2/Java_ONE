package Poliformismo_Herencia_Interfaces;

public class Gerente extends Funcionario implements Autenticable {


 
	
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return 2000;
	}

	@Override
	public void setContrasena(String contrasena) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String contrasena) {
		return contrasena=="AluraCursos";
	}
		 
}
