package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora d = new Calculadora(5.0, 10.0, 7.0);
		double resul = d.suma();
		assertEquals(15, resul, 0.00);
		//fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		Calculadora d = new Calculadora(5.0, 10.0, 7.0);
		double resul = d.resta();
		assertEquals(-5, resul, 0.00);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testMulti() {
		Calculadora d = new Calculadora(5.0, 10.0, 7.0);
		double resul = d.multi();
		assertEquals(50, resul, 0.00);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testDivi() {
		Calculadora d = new Calculadora(5.0, 10.0, 7.0);
		double resul = d.divi();
		assertEquals(0.5, resul, 0.00);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testMax() {
		Calculadora d = new Calculadora(5.0, 10.0, 7.0);
		double resul = d.max();
		assertEquals(10, resul, 0.00);
	}

}
