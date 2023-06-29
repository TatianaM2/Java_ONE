package Poliformismo_Herencia_Interfaces;

public class Contador extends Funcionario {
	private String usuario;
	private String contrasena;
	
	
	public void setUsuario(String usuario) {
		this.usuario=usuario;				
	}
	public String getUsuario() {
		return usuario;
	}
	
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public boolean iniciarSesion(String contrasena) {
		return contrasena=="AluraCursos";
		
		
	}
	
	
		
		public double getBonificacion() {
			System.out.println("EJECUTANDO DESDE CONTADOR");
			return 200;
				}
}
