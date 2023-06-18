package ByteBank;

public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		
		Cuenta cuenta=new Cuenta();
		Cliente cliente=new Cliente();
		cliente.setNombre("Tatiana Martinez");
		cliente.setDocumento("1082891");
		cliente.setTelefono("311262");
		
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
