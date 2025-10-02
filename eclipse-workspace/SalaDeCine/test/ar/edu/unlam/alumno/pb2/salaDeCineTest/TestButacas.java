package ar.edu.unlam.alumno.pb2.salaDeCineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.alumno.pb2.salaDeCineSRC.Butaca;
import ar.edu.unlam.alumno.pb2.salaDeCineSRC.Espectador;



public class TestButacas {

	private Butaca butaca = new Butaca();

	@Test
	public void probarQueSePuedeCrearUnaButacaYQueEstaDisponible() {
		assertNotNull(butaca);
		assertTrue(butaca.getButacaDisponible());
	}

	@Test
	public void probarQueUnaButacaEstáOcupada() {
		Espectador espectador = new Espectador("pepe", "gómez", 18);
		butaca.setEspectador(espectador);
		butaca.estaVendida();
		assertFalse(butaca.getButacaDisponible());
	}

	@Test
	public void probarQueUnaButacaOcupadaPuedeLiberarse() {
		butaca.liberarButaca();
		assertTrue(butaca.getButacaDisponible());
	}

	@Test
	public void cargarleLosDatosDelEspectadorAUnaButaca() {
		Espectador espectador = new Espectador("pepe", "gómez", 18);

		assertEquals("pepe", espectador.getNombreCliente());
		assertEquals("gómez", espectador.getApellidoCliente());
		assertEquals(18, espectador.getEdadCliente());
	}
	
	@Test
	public void cargarleLosDatosDelEspectadorAUnaButacaOtraVez() {
		Espectador espectador = new Espectador("pepe", "gómez", 18);

		assertEquals("pepe", espectador.getNombreCliente());
		assertEquals("gómez", espectador.getApellidoCliente());
		assertEquals(18, espectador.getEdadCliente());
	}

}
