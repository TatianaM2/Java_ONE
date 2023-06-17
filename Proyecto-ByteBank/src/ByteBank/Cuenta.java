package ByteBank;

public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void depositar ( double cantidadDinero){
		
		this.saldo+=cantidadDinero;		
		
	}
	public boolean retirar (double cantidadDinero){
		if(this.saldo>=cantidadDinero) {
			this.saldo-=cantidadDinero;
			return true;
			
		}
		return false;
		
	}
	
	public boolean transferir (double cantidadDinero, Cuenta cuenta){
		 if(this.saldo> cantidadDinero) {
			 this.saldo-= cantidadDinero;
			 cuenta.depositar(cantidadDinero);
			 return true;
			 
		 } 
		 return false;
		
		
	}

}
