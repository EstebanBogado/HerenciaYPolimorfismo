package ar.edu.unlam.alumno.pb2.herenciaYPolimorfismo;

public class Circulo extends HerenciaYPolimorfismo {
	private Double radio;

	public Circulo(Double radio) {
		this.radio = radio;
	}

	@Override 
	public Double calcularArea() {
		return Math.pow(this.radio, 2) * Math.PI;
	}

	@Override
	public Double calcularPerimetro() {
		return this.radio * Math.PI;

	}

	@Override
	public void dibujarFigura() {
		System.out.println("Se dibujará un círculo de radio " + this.radio + " cm.");
	}
 
}
