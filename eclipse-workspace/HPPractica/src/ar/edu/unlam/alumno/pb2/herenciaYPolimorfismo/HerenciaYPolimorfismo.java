package ar.edu.unlam.alumno.pb2.herenciaYPolimorfismo;

public abstract class HerenciaYPolimorfismo {
	protected Double area;
	protected Double perimetro;

	public HerenciaYPolimorfismo() {
	}

	public abstract Double calcularArea();

	public abstract Double calcularPerimetro();

	public abstract void dibujarFigura();

}
