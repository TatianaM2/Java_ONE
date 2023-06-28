package Poliformismo_Herencia_Interfaces;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public void depositar(double cantidadDinero) {
		this.saldo=this.saldo+cantidadDinero;
	}
	
	

}
