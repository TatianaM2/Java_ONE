package ByteBank;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta= new Cuenta();
		miCuenta.saldo=300;
		miCuenta.depositar(200);
		
		System.out.println("Cuenta 1:" +miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println("Retiro Cuenta 1:" +miCuenta.saldo);
		
	    Cuenta miCuenta2= new Cuenta();
	    miCuenta2.depositar(1000);
	    boolean puedeTransferir=miCuenta2.transferir(400, miCuenta);
	    
	    if(puedeTransferir) {
	    	System.out.println("Transferencia exitosa");
	    }else {
	    	System.out.println("No puede Transferir");
	    }
	    
	    
	    System.out.println("Saldo Cuenta 2: " +miCuenta2.saldo);  
	    System.out.println("Saldo cuenta 1: " +miCuenta.saldo);
	    
	    
	}

}
