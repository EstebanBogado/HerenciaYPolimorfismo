package ar.edu.unlam.alumno.pb2.mainTrasladoDeMascotas;

import java.util.Scanner;

import ar.edu.unlam.alumno.pb2.clases.Destino;
import ar.edu.unlam.alumno.pb2.clases.Traslados;
import ar.edu.unlam.alumno.pb2.clases.Viaje;

public class Main {
	private static Scanner teclado = new Scanner(System.in);

	private static final int AGREGAR_DESTINO = 1, AGREGAR_VIAJE = 2, VER_RESUMEN = 3, IMPORTE_VIAJE = 4,
			IMPORTE_PROMEDIO = 5, IMPORTE_TOTAL = 6, VIAJES_REALIZADOS = 7, SALIR = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traslados empresa;
		String nombreEmpresa;
		double costoMínimo;
		double costoPorKm;
		int nroDeViaje;
		System.out.println("Ingrese nombre del sistema: ");
		nombreEmpresa = teclado.nextLine();

		System.out.println("Ingrese el costo mínimo: ");
		costoMínimo = teclado.nextDouble();

		System.out.println("Ingrese el costo por kilómetro: ");
		costoPorKm = teclado.nextDouble();

		empresa = new Traslados(nombreEmpresa, costoMínimo, costoPorKm);

		int opcion = 0;

		do {
			mostrarMenu();
			opcion = teclado.nextInt();

			switch (opcion) {
			case AGREGAR_DESTINO:
				agregarNuevoDestino(empresa);
				break;
			case AGREGAR_VIAJE:
				agregarNuevoViaje(empresa);
				break;
			case VER_RESUMEN:
				mostrarResumenDeViajes(empresa);
				break;
			case IMPORTE_VIAJE:
				// *** Resolver este case***
				System.out.println("Ingrese nro de viaje: ");
				nroDeViaje = teclado.nextInt();
				teclado.nextLine();
				System.out.println("Costo del viaje " + nroDeViaje + " con descuento: "
						+ empresa.getViajes()[nroDeViaje - 1].getCostoViajeConDescuento());
				System.out.println("Costo del viaje " + nroDeViaje + " sin descuento: "
						+ empresa.getViajes()[nroDeViaje - 1].getCostoViaje());

//				System.out.println("Costo del viaje sin descuento: " + empresa.getCostoBrutoDelViaje());
//				System.out.println("Costo del viaje con descuento: " + empresa.getCostoViajeConDescuento());
				break;
			case IMPORTE_PROMEDIO:
				System.out.println(empresa.getViajesAcumulados());
				System.out.println(empresa.getCostoViajesAcumulados());
				System.out.println("Importe promedio de los viajes: " + empresa.getCostoPromedioDeViajes());
				break;
			case IMPORTE_TOTAL:
				System.out.println("Importe total de los viajes realizados: " + empresa.getCostoViajesAcumulados());
				break;

			}

		} while (opcion != 0);

	}

	private static void mostrarResumenDeViajes(Traslados empresa) {

		System.out.println("***RESUMEN DE VIAJES***" + empresa.getViajesAcumulados());

		System.out.println("***RESUMEN DE DESTINOS***" + empresa.getDestinosAcumulados());

	}

	private static void agregarNuevoViaje(Traslados empresa) {

		Destino destinoViaje;
		int codigoDestino;
		String nombrePasajero;
		String correoDelPasajero;
		double porcentajeDeDescuento;

		do {
			System.out.println("Ingrese el código de destino (0 salir): ");
			codigoDestino = teclado.nextInt();
			if (codigoDestino == 0) {
				return;
			}

			destinoViaje = empresa.buscarDestino(codigoDestino);

		} while (destinoViaje == null);
		teclado.nextLine();
		System.out.println("Ingrese el nombre del cliente: ");
		nombrePasajero = teclado.nextLine();

		System.out.println("Ingrese el correo del cliente: ");
		correoDelPasajero = teclado.nextLine();

		System.out.println("Ingrese el porcentaje de descuento (entre 0 y 100): ");
		porcentajeDeDescuento = teclado.nextDouble();

		Viaje nuevoViaje = new Viaje(destinoViaje, nombrePasajero, correoDelPasajero, porcentajeDeDescuento);

		if (empresa.agregarViaje(nuevoViaje)) {
			System.out.println("VIAJE AGREGADO CORRECTAMENTE!");
		} else {
			System.out.println("NO SE PUDO AGREGAR EL VIAJE!");
		}
		empresa.costoBrutoDelViaje(nuevoViaje);
		empresa.costoFinalViaje(nuevoViaje);

	}

	/***
	 * resolver mostrar el costo final del viaje
	 * 
	 * @param empresa
	 */

	private static void agregarNuevoDestino(Traslados empresa) {

		int codigoDestino;
		String nombreDestino;
		double distancia;

		System.out.println("Ingrese código de destino: ");
		codigoDestino = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese nombre de destino: ");
		nombreDestino = teclado.nextLine();

		System.out.println("Ingrese la distancia (km): ");
		distancia = teclado.nextInt();

		Destino nuevoDestino = new Destino(codigoDestino, nombreDestino, distancia);

		if (empresa.agregarDestino(nuevoDestino)) {
			System.out.println("DESTINO AGREGADO EXITOSAMENTE!");
		} else {
			System.out.println("NO SE PUDO AGREGAR EL DESTINO!");
		}
	}

	private static void mostrarMenu() {
		System.out.println("Opciones: ");
		System.out.println(AGREGAR_DESTINO + ".- Agregar destino.");
		System.out.println(AGREGAR_VIAJE + ".- Agregar viaje.");
		System.out.println(VER_RESUMEN + ".- Ver resumen.");
		System.out.println(IMPORTE_VIAJE + ".- Importe del viaje con descuento.");
		System.out.println(IMPORTE_PROMEDIO + ".- Importe promedio de viajes.");
		System.out.println(IMPORTE_TOTAL + ".- Importe total de los viajes realizados.");
		System.out.println(VIAJES_REALIZADOS + ".- Cantidad de viajes realizados");
		System.out.println(SALIR + ".- Salir.");
		System.out.println("Ingrese la opción deseada.");
	}

}
