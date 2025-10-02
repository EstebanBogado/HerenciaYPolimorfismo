package ar.edu.unlam.alumno.pb2.clases;

public class Viaje {

	private Destino destinoViaje;
	private String nombrePasajero;
	private String correoDelPasajero;
	private double porcentajeDeDescuento;
	private double costoViaje;
	private double costoViajeConDescuento;
	private int nroDeViaje;

	/***
	 * Toma los datos del destino y del pasajero y crea un viaje
	 * 
	 * @param destinoViaje
	 * @param nombrePasajero
	 * @param correoDelPasajero
	 * @param porcentajeDeDescuento - Entre 0 y 100
	 */
	public Viaje(Destino destinoViaje, String nombrePasajero, String correoDelPasajero, double porcentajeDeDescuento) {

		this.destinoViaje = destinoViaje;
		this.nombrePasajero = nombrePasajero;
		this.correoDelPasajero = correoDelPasajero;
		this.porcentajeDeDescuento = porcentajeDeDescuento;

	}

	/***
	 * Asigna el costo del viaje y calucula el costo del mismo aplicando el
	 * descuento, el que varia entre 0 y 100
	 * 
	 * @param costoViaje
	 */
	public void setCostoFinalViaje(double costoViaje) {

		this.costoViaje = costoViaje;
		double descuento = this.costoViaje * porcentajeDeDescuento / 100;

		this.costoViajeConDescuento = costoViaje - descuento;

	}

	public Destino getDestinoViaje() {
		return destinoViaje;
	}

	public String getNombrePasajero() {
		return nombrePasajero;
	}

	public String getCorreoDelPasajero() {
		return correoDelPasajero;
	}

	public double getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}

	public double getCostoViaje() {
		return costoViaje;
	}

	public double getCostoViajeConDescuento() {
		return this.costoViajeConDescuento;
	}

	public void setNroDeViaje(int nroDeViaje) {
		this.nroDeViaje = nroDeViaje;
	}
	
	
	public int getNroDeViaje() {
		return this.nroDeViaje;
	}
}
