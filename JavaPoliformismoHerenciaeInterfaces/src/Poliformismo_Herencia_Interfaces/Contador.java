package Poliformismo_Herencia_Interfaces;

public class Contador extends Funcionario {
		@Override
		public double getBonificacion() {
			System.out.println("EJECUTANDO DESDE CONTADOR");
			return 200;
				}
}
