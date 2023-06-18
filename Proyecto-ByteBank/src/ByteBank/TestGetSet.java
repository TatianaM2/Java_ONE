package ByteBank;

public class TestGetSet {
	 public static void main(String[] args) {
	        Cuenta cuenta = new Cuenta();

	        cuenta.setNumero(1337);
	        System.out.println(cuenta.getNumero());

	        Cliente Tatiana = new Cliente();
	        Tatiana.setNombre("Tatiana Martinez");

	        cuenta.setTitular(Tatiana);

	        System.out.println(cuenta.getTitular().getNombre());

	        cuenta.getTitular().setTelefono("311262");
	        //ahora en dos lineas
	        Cliente titular = cuenta.getTitular();
	        titular.setTelefono("311262");

	        System.out.println(titular);
	        System.out.println(Tatiana);
	        System.out.println(cuenta.getTitular());
	    }
}
