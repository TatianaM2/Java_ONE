package Pila_Ejecucion;

public class FlujoConTratamiento {

	

	public static void main(String[] args) {
        System.out.println("Inicio main");
        try {
            metodo1();
    } catch(ArithmeticException | NullPointerException | MiExcepcion ex) {
            String msg = ex.getMessage();

            System.out.println("Exception " + msg);
            ex.printStackTrace();
    }
        System.out.println("Fin de main");
    }

    private static void metodo1() throws MiExcepcion {
        System.out.println("Inicio del metodo1");
        metodo2();
        System.out.println("Fin del metodo1");
    }

    private static void metodo2() throws MiExcepcion {
        System.out.println("Inicio del metodo2");
        throw new MiExcepcion ("Surgió un error");
        // System.out.println("Fin del metodo2"); 
    }

	
}
