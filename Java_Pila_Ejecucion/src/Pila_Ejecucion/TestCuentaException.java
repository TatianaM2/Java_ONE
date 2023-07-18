package Pila_Ejecucion;

public class TestCuentaException {
	
public static void main(String[] args) {
		
		Cuenta2 cuenta = new Cuenta2();
		try {
			cuenta.depositar();
		} catch (CuentaMiException e) {
			e.printStackTrace();
		}
		
	}

}
