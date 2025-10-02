package ar.edu.unlam.alumno.pb2.clases;

import java.util.Arrays;

public class Traslados {

	private String nombreSistema;
	private double costoKm;
	private double costoMinimoViaje;
	private Destino destinos[];
	private int viajesAcumulados = 0;
	private int costoViajesAcumulados = 0;
	private static final int CANTIDAD_DE_DESTINOS = 100;
	private static final int CANTIDAD_DE_VIAJES = 100;
	private Viaje viajes[];

	/***
	 * El constructor toma los valores necesarios para generar un nuevo traslado
	 * 
	 * @param nombreSistema
	 * @param costoMinimoViaje
	 * @param costoKm
	 */
	public Traslados(String nombreSistema, double costoMinimoViaje, double costoKm) {
		this.nombreSistema = nombreSistema;
		this.costoMinimoViaje = costoMinimoViaje;
		this.costoKm = costoKm;
	}

	/***
	 * Agrega un destino al array de destinos
	 * 
	 * @param destinoViaje
	 * @return - true si el destino no existe o false si el destino ya existe
	 */
	public boolean agregarDestino(Destino destinoViaje) {
		if (existeDestino(destinoViaje.getCodigoDestino())) {
			return false;
		}
		for (int i = 0; i < CANTIDAD_DE_DESTINOS; i++) {
			if (this.destinos[i] == null) {
				this.destinos[i] = destinoViaje;
				return true;
			}
		}
		return false;
	}

	/***
	 * 
	 * @param codigoDestino
	 * @return
	 */
	private boolean existeDestino(int codigoDestino) {

		return this.buscarDestino(codigoDestino) != null;
	}

	/***
	 * 
	 * @param codigoDestino
	 * @return
	 */
	private Destino buscarDestino(int codigoDestino) {

		for (int i = 0; i < CANTIDAD_DE_DESTINOS; i++) {
			if (this.destinos[i] != null && this.destinos[i].getCodigoDestino() == codigoDestino) {
				return this.destinos[i];
			}
		}
		return null;
	}

	/***
	 * 
	 * @param destino
	 * @return
	 */
	public double costoBrutoDelViaje(Destino destino) {
		return this.costoMinimoViaje + (destino.getDistancia() * this.costoKm);

	}

	/***
	 * 
	 * @param viaje
	 */
	public void agregarViaje(Viaje viaje) {
		for (int i = 0; i < CANTIDAD_DE_VIAJES; i++) {
			if (viajes[i] == null) {
				this.viajes[i] = viaje;
				this.viajesAcumulados++;
				this.costoViajesAcumulados += this.viajes[i].getCostoViajeConDescuento();
			}
		}
	}

	/***
	 * 
	 * @param viaje
	 * @return
	 */
	public double importeTotalDeLosViajes(Viaje viaje) {
		return this.costoViajesAcumulados;

	}

	/***
	 * 
	 * @return
	 */
	public double importePromedioDeLosViajes() {
		return this.costoViajesAcumulados / this.viajesAcumulados;
	}

	public String getNombreSistema() {
		return nombreSistema;
	}

	/***
	 * ordena el arreglo de menor a mayo mediante burbujeo 
	 */
	public void ordenarViajesAscendente() {
		for (int i = 0; i < CANTIDAD_DE_VIAJES; i++) {
			for (int j = 0; j < CANTIDAD_DE_VIAJES; j++) {
				if (viajes[j].getCostoViajeConDescuento() > viajes[j + 1].getCostoViajeConDescuento()) {
					Viaje temp = viajes[j + 1];
					viajes[j + 1] = viajes[j];
					viajes[j] = temp;
				}
			}
		}
	}

	public double getCostoKm() {
		return costoKm;
	}

	public double getCostoMinimoViaje() {
		return costoMinimoViaje;
	}

	public Destino[] getDestinos() {
		return destinos;
	}

	public int getViajesAcumulados() {
		return viajesAcumulados;
	}

	public int getCostoViajesAcumulados() {
		return costoViajesAcumulados;
	}

	public static int getCantidadDeDestinos() {
		return CANTIDAD_DE_DESTINOS;
	}

	public static int getCantidadDeViajes() {
		return CANTIDAD_DE_VIAJES;
	}

	public Viaje[] getViajes() {
		return viajes;
	}

	@Override
	public String toString() {
		return "Traslados [nombreSistema=" + nombreSistema + ", costoKm=" + costoKm + ", costoMinimoViaje="
				+ costoMinimoViaje + ", destinos=" + Arrays.toString(destinos) + ", viajesAcumulados="
				+ viajesAcumulados + ", costoViajesAcumulados=" + costoViajesAcumulados + ", viajes="
				+ Arrays.toString(viajes) + "]";
	}

}
