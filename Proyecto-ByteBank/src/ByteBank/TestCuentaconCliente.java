package ByteBank;

public class TestCuentaconCliente {
	public static void main(String[] args) {
		Cliente Tatiana= new Cliente();
		Tatiana.setNombre("Tatiana Martinez") ;
		Tatiana.setDocumento("10828");
		Tatiana.setTelefono("311262");
		
		Cuenta cuentaDeTatiana = new Cuenta();
        cuentaDeTatiana.depositar(100);

        // cuentaDeTatiana.titular = Tatiana;
        cuentaDeTatiana.setTitular(Tatiana);
        System.out.println(cuentaDeTatiana.getTitular().getNombre());

			
		
	}
	
		
}
