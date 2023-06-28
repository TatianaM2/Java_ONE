package Poliformismo_Herencia_Interfaces;

public  abstract class Cuenta {
	protected double saldo;
	private int agencia=1;
	private int numero;
	private Cliente titular=new Cliente();	
	private static 	int total=0;
	
	public Cuenta () {
		
	}
	
	public Cuenta( int agencia, int numero){        
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta: " + this.numero);
        Cuenta.total++;
        System.out.println("Total de cuentas es: " + Cuenta.total);
	}
	
	public  abstract void depositar ( double cantidadDinero);		
			
		
	
	public boolean retirar (double cantidadDinero){
		if(this.saldo>=cantidadDinero) {
			this.saldo-=cantidadDinero;
			return true;
			
		}else {
            return false;
        }		
	}
	
	public boolean transferir (double cantidadDinero, Cuenta cuenta){
		 if(this.saldo>=cantidadDinero) {
			 this.retirar(cantidadDinero);
			 cuenta.depositar(cantidadDinero);
			 return true;			 
		 } 
		 else {
	            return false;
	        }
		
	}
	public double getSaldo() {
		return this.saldo;		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		 if(numero <= 0) {
	            System.out.println("No pueder ser el valor menor o igual a 0");
	            return;
	        }else {
	        this.numero = numero;
	}
	}
	 		
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
            System.out.println("No pueder ser el valor menor o igual a ");
            return;
        }else {
        this.agencia = agencia;
}
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
}
