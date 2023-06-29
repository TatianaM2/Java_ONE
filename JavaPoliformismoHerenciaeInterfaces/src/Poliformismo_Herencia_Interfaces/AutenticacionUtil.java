package Poliformismo_Herencia_Interfaces;

public class AutenticacionUtil {
	private String contrasena;
	
	
	public void setContrasena(String contrasena) {
		this.contrasena=contrasena;
		
	}

	public boolean iniciarSesion(String contrasena) {
		if(this.contrasena==contrasena) {
		return true;
	} else {
		return false;
	}
}
}
