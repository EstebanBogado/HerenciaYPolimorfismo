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

import org.junit.Before;
import org.junit.Test;

public class TestTerreno {
	Terreno terreno;
	
	@Before
	public void init() {
		int fila = 3;
		int columna = 5;
		this.terreno = new Terreno(fila, columna);
	}
		
	@Test
	public void queSePuedaPlantarTomateEnTerreno() {
		assertEquals(15, terreno.getTotalParcelas());
		assertEquals(15, terreno.getTotalParcelasLibres());
		assertEquals(0, terreno.getTotalParcelasOcupadas());
		
		terreno.plantarTomate(6);
		
		assertEquals(15, terreno.getTotalParcelas());
		assertEquals(9, terreno.getTotalParcelasLibres());
		assertEquals(6, terreno.getTotalParcelasOcupadas());
		
	}
	
	@Test
	public void queSePuedaPlantarDeTodoEnTerreno() {
		assertEquals(15, terreno.getTotalParcelas());
		assertEquals(15, terreno.getTotalParcelasLibres());
		assertEquals(0, terreno.getTotalParcelasOcupadas());
		
		terreno.plantarTomate(6);
		terreno.plantarTrigo(3);
		terreno.plantarMaiz(1);
		
		assertEquals(15, terreno.getTotalParcelas());
		assertEquals(5, terreno.getTotalParcelasLibres());
		assertEquals(10, terreno.getTotalParcelasOcupadas());
		
	}
	
	@Test
	public void queSePuedaTenerCosechasExitosas() {
		terreno.plantarTomate(6);
		terreno.regar();
		
		terreno.pasarDia();
		
		terreno.plantarTrigo(3);
		terreno.plantarMaiz(1);
		
		terreno.cosechar();
		
		assertEquals(6, terreno.getCantidadCultivosEnDeposito());

		
	}

}
