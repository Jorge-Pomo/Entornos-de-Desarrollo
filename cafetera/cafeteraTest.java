package cafetera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cafeteraTest {

	@Test
	void testLlenarCafetera() {
//		cafetera f1 = new cafetera();
//		f1.llenarCafetera();
//		assertEquals(1000, f1.getCantidadActual());
		
		cafetera f2 = new cafetera(2500);
		f2.llenarCafetera();
		assertEquals(2500, f2.getCantidadActual());
		
	}

	@Test
	void testServirTaza() {
		cafetera f1 = new cafetera();
		f1.servirTaza(100);
		assertEquals(0, f1.getCantidadActual());
	}

	@Test
	void testVaciarCafetera() {
		cafetera f1 = new cafetera();
		f1.vaciarCafetera();
		assertEquals(0, f1.getCantidadActual());
	}

	@Test
	void testAgregarCafe() {
		cafetera f1 = new cafetera();
		f1.agregarCafe(100);
		assertEquals(100, f1.getCantidadActual());
	}

}
