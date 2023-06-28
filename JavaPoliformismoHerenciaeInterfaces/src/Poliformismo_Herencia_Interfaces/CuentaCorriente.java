package Poliformismo_Herencia_Interfaces;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean retirar(double cantidadDinero) {
		double comision=0.2;
		return super.retirar(cantidadDinero+(comision));
}
	//@Override
	//public void depositar(double cantidadDinero) {
		// TODO Auto-generated method stub
		//super.depositar(cantidadDinero);
	//}

	@Override
	public void depositar(double cantidadDinero) {
		this.saldo+=cantidadDinero;	
		
	}
}
