package Poliformismo_Herencia_Interfaces;

public class ControlBonificacion {
	 
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		
		this.suma=funcionario.getBonificacion()+suma;
		System.out.println("Calculo actual: "+this.suma);
		return this.suma;
	}
	
}
