package Poliformismo_Herencia_Interfaces;

public class TestGerente {
	public static void main(String[] args) {
		Gerente TatianaM=new Gerente();
		//Funcionario Tatiana= new Funcionario();
		TatianaM.setNombre("Tatiana Martinez");
		TatianaM.setDocumento("123456");
		TatianaM.setSalario(1160000);
		TatianaM.setTipo(1);
		TatianaM.setContrasena(22);
		TatianaM.iniciarSesion("AluraCursos");		
	    boolean autenticarUsuario=TatianaM.autenticar(22);

	        

	
		System.out.println("Nombre: "+TatianaM.getNombre()+"\n"+
							"Documento: "+TatianaM.getDocumento()+"\n"+
							"Salario: "+TatianaM.getSalario());
		System.out.println("Bonificacion: "+TatianaM.getBonificacion());
		System.out.println("Iniciar Sesion: "+TatianaM.iniciarSesion("AluraCursos"));
		System.out.println("Autenticar Usuario: "+autenticarUsuario);
	}

}
