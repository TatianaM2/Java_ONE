package Poliformismo_Herencia_Interfaces;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario funcionario= new Funcionario();
		funcionario.setSalario(2000);
		
		Gerente gerente= new Gerente();
		gerente.setSalario(10000);
		
		Contador contador=new Contador();
		contador.setSalario(5000);
		
		ControlBonificacion controlBonificacion= new ControlBonificacion();
		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(gerente);
		controlBonificacion.registrarSalario(contador);
	}

}