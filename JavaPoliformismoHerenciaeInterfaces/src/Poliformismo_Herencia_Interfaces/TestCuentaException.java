package Poliformismo_Herencia_Interfaces;

public class TestCuentaException {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(200);
		try {
			cuenta.retirar(200);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
