package ar.edu.unlam.alumno.pb2.herenciaYPolimorfismoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.alumno.pb2.herenciaYPolimorfismo.Circulo;
import ar.edu.unlam.alumno.pb2.herenciaYPolimorfismo.HerenciaYPolimorfismo;
import ar.edu.unlam.alumno.pb2.herenciaYPolimorfismo.Rectangulo;

public class HerenciaYPolimorfismoTest {

	@Test
	public void trabajarConUnRectangulo() {

		Rectangulo rectangulo = new Rectangulo(3.5, 4.5);

		rectangulo.dibujarFigura();

		assertEquals(15.75, rectangulo.calcularArea(), 0.01);
		assertEquals(16, rectangulo.calcularPerimetro(), 0.01);
	}

	@Test
	public void trabajarConUnCiirculo() {

		Circulo circulo = new Circulo(3.5);

		circulo.dibujarFigura();

		assertEquals(38.4845, circulo.calcularArea(), 0.01);
		assertEquals(10.99, circulo.calcularPerimetro(), 0.01);
	}

	@Test
	public void probarFiguraRectangulo() {
		HerenciaYPolimorfismo figura;
		figura = new Rectangulo(4.0, 5.0);

		assertEquals(20, figura.calcularArea(), 0.01);

	}
	

	@Test
	public void probarInterfazColoreable() {
		HerenciaYPolimorfismo rectangulo = new Rectangulo(4.5, 4.5);
		Circulo circulo = new Circulo(3.5);
		Rectangulo otroRectangulo = new Rectangulo(6.0, 5.0);
		
		otroRectangulo.setColor("rojo");
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularPerimetro());
		System.out.println(otroRectangulo.getColor());

		assertEquals(20.25, rectangulo.calcularArea(), 0.01);
		assertEquals(10.99, circulo.calcularPerimetro(), 0.01);
		assertEquals("rojo", otroRectangulo.getColor());
	}

}
