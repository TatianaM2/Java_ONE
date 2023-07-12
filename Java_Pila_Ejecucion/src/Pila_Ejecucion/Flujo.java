package Pila_Ejecucion;

public class Flujo {

	

		  public static void main(String[] args) {
		    System.out.println("Inicio de main");
		    metodo1();
		    System.out.println("Fin do main");
		  }
		  public static void metodo1(){
		    System.out.println("Inicio de metodo1");
		    metodo2();
		    System.out.println("Fin do metodo1");
		  }
		  public static void metodo2(){
		    System.out.println("Inicio de metodo2");
		    for(int i =1; i<= 5; i++){
		      System.out.println(i);
		    }
		    System.out.println("Fin de metodo2");
		  
		}
}
