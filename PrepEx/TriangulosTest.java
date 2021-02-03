package PrepEx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangulosTest {

	@Test
	void testValidarTriangulo() {
		String resu = "a";
		
		resu = Triangulos.ValidarTriangulo(-5, 10, 10);
		assertEquals("Triangulo Inválido, lados negativos o nulos", resu);
		resu = Triangulos.ValidarTriangulo(10, -5, 10);
		assertEquals("Triangulo Inválido, lados negativos o nulos", resu);
		resu = Triangulos.ValidarTriangulo(10, 10, -5);
		assertEquals("Triangulo Inválido, lados negativos o nulos", resu);
	
		resu = Triangulos.ValidarTriangulo(20, 5, 5);
		assertEquals("Triangulo Inválido, no desigualdad triangular", resu);
		resu = Triangulos.ValidarTriangulo(5, 20, 5);
		assertEquals("Triangulo Inválido, no desigualdad triangular", resu);
		resu = Triangulos.ValidarTriangulo(5, 5, 20);
		assertEquals("Triangulo Inválido, no desigualdad triangular", resu);
		
		resu = Triangulos.ValidarTriangulo(5, 5, 5);
		assertEquals("Triangulo Equilatero", resu);
		
		resu = Triangulos.ValidarTriangulo(2, 2, 3);
		assertEquals("Triangulo Isosteles", resu);
		resu = Triangulos.ValidarTriangulo(3, 2, 2);
		assertEquals("Triangulo Isosteles", resu);
		resu = Triangulos.ValidarTriangulo(2, 3, 2);
		assertEquals("Triangulo Isosteles", resu);
		
		resu = Triangulos.ValidarTriangulo(2, 1, 3);
		assertEquals("Triangulo Escaleno", resu);
		
	}

}
