package Poliformismo_Herencia_Interfaces;

public class Administrador extends Funcionario implements Autenticable {

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
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
