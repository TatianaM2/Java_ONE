package Poliformismo_Herencia_Interfaces;

public class Gerente extends Funcionario {
	private String usuario;
	private int contrasena;
	
	
	
	public void setUsuario(String usuario) {
		this.usuario=usuario;				
	}
	public String getUsuario() {
		return usuario;
	}
	
	public int getContrasena() {
		return contrasena;
	}

	public void setContrasena(int contrasena) {
		this.contrasena = contrasena;
	}


	public boolean iniciarSesion(String usuario) {
		return usuario=="AluraCursos";
		
		
	}
	
	public boolean autenticar(int contrasena) {
		if (this.contrasena == contrasena) {
	        return true;
	    } else {
	        return false;
	    }
	}
		 
}
