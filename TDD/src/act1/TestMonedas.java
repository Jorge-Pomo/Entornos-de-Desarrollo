package act1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMonedas {

	// @Test
	// public void testCrearMoneda() {
	//
	// Dolar cinco = new Dolar(5);
	//
	// assertEquals(5, cinco.cantidad);
	// }
	
	// @Test
	// public void testMultiplicacion() {
	// Dolar cinco = new Dolar(5);
	// cinco.multiplicadoPor(2);
	// assertEquals(10, cinco.cantidad)
	// }

	//	@Test
	//	public void testMultiplicacion() {
	//		Dolar cinco = new Dolar(5);
	//		Dolar resultado = cinco.multiplicadoPor(2);
	//		assertEquals(10, resultado.cantidad);
	//		resultado = cinco.multiplicadoPor(3);
	//		assertEquals(15, resultado.cantidad);
	//
	//	}
	
	@Test
	public void testIgualdad() {
//		assertTrue(new Dolar(5).equals(new Dolar(5)));
//		assertFalse(new Dolar(5).equals(new Dolar(6)));
//		assertTrue(new Euro(5).equals(new Euro(5)));
//		assertFalse(new Euro(5).equals(new Euro(6)));
//		assertFalse(new Euro(5).equals(new Dolar(5)));
		
		assertTrue(Moneda.dolar(5).equals(Moneda.dolar(5)));
		assertFalse(Moneda.dolar(5).equals(Moneda.dolar(6)));
		assertTrue(Moneda.euro(5).equals(Moneda.euro(5)));
		assertFalse(Moneda.euro(5).equals(Moneda.euro(6)));
		assertFalse(Moneda.euro(5).equals(Moneda.dolar(5)));
	}
	
	@Test
	public void testCrearMoneda() {
//		assertEquals(new Dolar(5), new Dolar(5));
		
		assertEquals(Moneda.dolar(5), Moneda.dolar(5));
	}
	
	@Test
	public void testMultiplicacion() {
		Moneda cinco = Moneda.dolar(5);
		assertEquals(Moneda.dolar(10), cinco.multiplicadoPor(2));
		assertEquals(Moneda.dolar(15), cinco.multiplicadoPor(3));

	}
	
	@Test
	public void testMultiplicacionEuro() {
		Moneda cinco = Moneda.euro(5);
		assertEquals(Moneda.euro(10), cinco.multiplicadoPor(2));
		assertEquals(Moneda.euro(15), cinco.multiplicadoPor(3));
	}
	
	@Test
	public void testDenominacion() {
		assertEquals("USD", Moneda.dolar(1).denominacion());
		assertEquals("EUR", Moneda.euro(1).denominacion());
	}
	
}
