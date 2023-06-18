package ByteBank;

public class PruebaCosnstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(123,456);
		Cuenta cuenta2 = new Cuenta(123,4566);
		Cuenta cuenta3 = new Cuenta(123,4567);
		
		System.out.println(Cuenta.getTotal());
}
}
