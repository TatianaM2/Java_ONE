package EjerciciosBasicos;

public class Condicional_While {
	public static void main(String[] args) {
		int [] numeros= {1, 5, 7, 9, 10, 11};
		int i=0;
		while (i<numeros.length) {
			System.out.println("Este conjunto de datos esta formado por: "+numeros[i]);
			i++;		
		}
	}
}
