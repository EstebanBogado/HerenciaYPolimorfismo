package ar.edu.unlam.alumno.pb2.clases;

public class Destino {

	private int codigoDestino;
	private String nombreDestino;
	private double distancia;

	/***
	 * Crea un destino para el viaje
	 * 
	 * @param codigoDestino
	 * @param nombreDestino
	 * @param distancia
	 */
	public Destino(int codigoDestino, String nombreDestino, double distancia) {
		
		this.codigoDestino = codigoDestino;
		this.nombreDestino = nombreDestino;
		this.distancia = distancia;
	}

	public int getCodigoDestino() {

		return this.codigoDestino;
	}

	public String getNombreDestino() {
		return this.nombreDestino;
	}

	public double getDistancia() {
		return this.distancia;
	}
}
