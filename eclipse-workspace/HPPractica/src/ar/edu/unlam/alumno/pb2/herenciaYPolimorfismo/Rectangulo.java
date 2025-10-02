package ar.edu.unlam.alumno.pb2.herenciaYPolimorfismo;

public class Rectangulo extends HerenciaYPolimorfismo implements Coloreable{
	private Double base;
	private Double altura;
	private String color;

	public Rectangulo(Double ladoA, Double ladoB) {
		this.base = ladoA;
		this.altura = ladoB;

	}


	@Override
	public Double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public Double calcularPerimetro() {
		return this.base * 2 + this.altura * 2;
	}

	@Override
	public void dibujarFigura() {
		System.out.println("Se dibujará un rectángulo de " + base + " cm por " + altura + " cm.");
	}


	@Override
	public void setColor(String color) {
		this.color = color;
	
	}


	@Override
	public String getColor() {
		return this.color;
	}

}
