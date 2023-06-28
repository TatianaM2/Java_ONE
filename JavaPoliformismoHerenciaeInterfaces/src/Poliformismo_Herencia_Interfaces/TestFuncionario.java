package Poliformismo_Herencia_Interfaces;

public class TestFuncionario {
	public static void main(String[] args) {
		
		Funcionario Tatiana= new Contador();
		Tatiana.setNombre("Tatiana Martinez");
		Tatiana.setDocumento("123456");
		Tatiana.setSalario(116000);
		Tatiana.setTipo(1);
	
		System.out.println("Nombre: "+Tatiana.getNombre()+"\n"+
							"Documento: "+Tatiana.getDocumento()+"\n"+
							"Salario: "+Tatiana.getSalario());
		System.out.println("Bonificacion: "+Tatiana.getBonificacion());
}

}
