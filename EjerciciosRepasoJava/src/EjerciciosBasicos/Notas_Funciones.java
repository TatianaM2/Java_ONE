package EjerciciosBasicos;

import java.util.Scanner;

public class Notas_Funciones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cuantos estudiantes desea ingresar");
		int estudiantes = in.nextInt();
		System.out.println("Digite cuantas notas desea ingresar");
		int tamano = in.nextInt();
		// Crear el vector
		float[] notasEstudiante = new float[tamano];

		// Leer las notas del estudiante
		for (int j = 0; j < estudiantes; j++) {
			float promedio;

			System.out.println("Estudiante" + (j + 1));
			for (int i = 0; i < tamano; i++) {
				System.out.print("Ingrese la nota " + (i + 1) + ": ");
				notasEstudiante[i] = in.nextFloat();
			}
			promedio = obtenerPromedio(notasEstudiante);
			System.out.println("El promedio de las notas del estudiante " + (j + 1) + " es: " + promedio);

			System.out.println("Las notas del estudiante " + (j + 1) + " son:");
			imprimirNotas(notasEstudiante);

		}

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

	public static void imprimirNotas(float[] notasEstudiantes) {

		for (float nota : notasEstudiantes) {
			System.out.println("Nota : " + nota);

		}
	}
}
