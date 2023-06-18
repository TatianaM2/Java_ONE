package ByteBank;

public class TestSacaNegativo {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
        cuenta.depositar(100);
        System.out.println(cuenta.retirar(200));
        System.out.println(cuenta.getSaldo());

        // prohibido (solucionado)
        // cuenta.saldo = cuenta.saldo - 101;
	}

}
