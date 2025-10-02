package ar.edu.unlam.alumno.pb2.mainTrasladoDeMascotas;

import java.util.Scanner;

import ar.edu.unlam.alumno.pb2.clases.Traslados;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	private static final int AGREGAR_DESTINO = 1, AGREGAR_VIAJE = 2, VER_RESUMEN = 3, SALIR = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traslados empresa;
		String nombre;
		double costoMínimo;
		double costoPorKm;

		System.out.println("Ingrese nombre del sistema: ");
		nombre = teclado.nextLine();

		System.out.println("Ingrese el costo mínimo: ");
		costoMínimo = teclado.nextDouble();

		System.out.println("Ingrese el costo por kilómetro: ");
		costoPorKm = teclado.nextDouble();

		empresa = new Traslados(nombre, costoMínimo, costoPorKm);

		System.out.println("Opciones: ");
		System.out.println(AGREGAR_DESTINO + ".- Agregar destino.");
		System.out.println(AGREGAR_VIAJE + ".- Agregar viaje.");
		System.out.println(VER_RESUMEN + ".- Ver resumen.");
		System.out.println(SALIR + ".- Salir.");
		System.out.println("Ingrese la opción deseada.");

		teclado.close();
	}

}
