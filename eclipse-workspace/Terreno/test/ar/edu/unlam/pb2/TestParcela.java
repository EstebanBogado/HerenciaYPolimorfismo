/*
 * Necesito un sistema para gestionar un Terreno
 * - Las parcelas se organizan en una matriz dentro del terreno
 * - En cada parcela puede cultivarse maíz, trigo o tomate
 * - Al pasar el dia, si en la parcela había algo sembrado y regado,
 *   pasa a estar listo para cosecharse.
 * - Las cosechas exitosas deben almacenarse en un array dentro del terreno
 */

package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestParcela {

	@Test
	public void queSePuedaCultivarEnParcela() {
		Parcela parcela = new Parcela();
		assertTrue(parcela.estaLibre());
		
		parcela.cultivar(new Tomate());
		
		assertTrue(parcela.hayCultivo());
	}
	
	@Test
	public void queSePuedaRegarEnParcela() {
		Parcela parcela = new Parcela();
		assertTrue(parcela.estaLibre());
		parcela.cultivar(new Tomate());		
		assertTrue(parcela.hayCultivo());
		parcela.regar();
		assertTrue(parcela.estaRegada());
	}
	
	@Test
	public void queSePuedaCosecharEnParcela() {
		Parcela parcela = new Parcela();
		assertTrue(parcela.estaLibre());
		parcela.cultivar(new Tomate());		
		assertTrue(parcela.hayCultivo());
		parcela.regar();
		assertTrue(parcela.estaRegada());
		parcela.pasarDia();
		assertNotNull(parcela.cosechar());
		assertTrue(parcela.estaLibre());
	}
	

}
