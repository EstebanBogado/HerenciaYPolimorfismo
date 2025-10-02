package ar.edu.unlam.alumno.pb2.secuenciaTDDTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.alumno.pb2.secuenciaTDD.SecuenciaTDD;

public class SecuenciaTDDTest {

	@Test
	public void secuenciaTest() {
		
		
		
		SecuenciaTDD.serieFibonacci(15);
		
 
		int respuesta = SecuenciaTDD.calcular(0);
		int respuesta1 = SecuenciaTDD.calcular(1);

		assertEquals(0, respuesta);
		assertEquals(1, respuesta1);
		assertEquals(0, SecuenciaTDD.getFibonacci(0));
		assertEquals(1, SecuenciaTDD.getFibonacci(1));
		assertEquals(1, SecuenciaTDD.getFibonacci(2));
		assertEquals(2, SecuenciaTDD.getFibonacci(3));
		assertEquals(3, SecuenciaTDD.getFibonacci(4));
		assertEquals(5, SecuenciaTDD.getFibonacci(5));
		

		
	} 

}
