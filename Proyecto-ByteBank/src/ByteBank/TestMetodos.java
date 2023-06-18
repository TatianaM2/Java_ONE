package ByteBank;

public class TestMetodos {
	
	public static void main(String[] args) {
		  Cuenta cuentaDeTatiana = new Cuenta();
	        // cuentaDeTatiana.saldo = 100;
	        cuentaDeTatiana.depositar(100);
	        cuentaDeTatiana.depositar(50);
	        System.out.println(cuentaDeTatiana.getSaldo());

	        boolean consigioRetirar = cuentaDeTatiana.retirar(20);
	        System.out.println(cuentaDeTatiana.getSaldo());
	        System.out.println(consigioRetirar);

	        Cuenta cuentaDeJimena = new Cuenta();
	        cuentaDeJimena.depositar(1000);

	        boolean exitoTransferencia = cuentaDeJimena.transferir(300, cuentaDeTatiana);
	        if(exitoTransferencia) {
	            System.out.println("transferencia exitosa");
	        } else {
	            System.out.println("falto dinero");
	        }
	    }

}
