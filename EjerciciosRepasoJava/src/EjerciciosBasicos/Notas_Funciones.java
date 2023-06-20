package EjerciciosBasicos;

import java.util.Scanner;

public class Notas_Funciones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite cuantas notas desea ingresar");
		int tamano = in.nextInt();
		// Crear el vector
		float[] notasEstudiante = new float[tamano];

		// Leer las notas del estudiante
		for (int i = 0; i < tamano; i++) {
			System.out.print("Ingrese la nota " + (i + 1) + ": ");
			notasEstudiante[i] = in.nextFloat();
		}
		// Imprimir las notas del estudiante
		System.out.println("Notas ingresadas del estudiante:");
		for (int i = 0; i < tamano; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notasEstudiante[i]);
		}

		// Calcular el promedio de las notas
		float promedio = obtenerPromedio(notasEstudiante);

		System.out.println("El promedio de las notas es: " + promedio);

		in.close();
	}

	// Función para obtener el promedio de un vector de notas
	public static float obtenerPromedio(float[] notasEstudiante) {
		float suma = 0;

		for (float nota : notasEstudiante) {
			suma += nota;
		}

		return suma / notasEstudiante.length;
	}
}
