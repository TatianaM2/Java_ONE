package Poliformismo_Herencia_Interfaces;

public class CuentaCorriente extends Cuenta implements Tributacion  {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean retirar(double cantidadDinero) {
		double comision=0.2;
		return super.retirar(cantidadDinero+(comision));
}
	

	@Override
	public void depositar(double cantidadDinero) {
		this.saldo+=cantidadDinero;	
		
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
}
