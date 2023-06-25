package Poliformismo_Herencia_Interfaces;

public class TestGerente {
	public static void main(String[] args) {
		Gerente TatianaM=new Gerente();
		Funcionario Tatiana= new Funcionario();
		Tatiana.setNombre("Tatiana Martinez");
		Tatiana.setDocumento("123456");
		Tatiana.setSalario(116000);
		Tatiana.setTipo(0);
		TatianaM.setContrasena(22);
		TatianaM.iniciarSesion("AluraCursos");		
	    boolean autenticarUsuario=TatianaM.autenticar(22);

	        

	
		System.out.println("Nombre: "+Tatiana.getNombre()+"\n"+
							"Documento: "+Tatiana.getDocumento()+"\n"+
							"Salario: "+Tatiana.getSalario());
		System.out.println("Bonificacion: "+Tatiana.getBonificacion());
		System.out.println("Iniciar Sesion: "+TatianaM.iniciarSesion("AluraCursos"));
		System.out.println("Autenticar Usuario: "+autenticarUsuario);
	}

}
