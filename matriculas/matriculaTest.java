package matriculas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class matriculaTest {

	@Test
	void testSiguienteMatricula() {
		String pro = matricula.siguienteMatricula("0485FPR");
		assertEquals("0486FPR", pro);
		
		pro = matricula.siguienteMatricula("9999FPZ");
		assertEquals("0000FQB", pro);
		
	}

	@Test
	void testSiguienteNumero() {
		String num = matricula.siguienteNumero("1234");
		assertEquals("1235", num);
		
		num = matricula.siguienteNumero("0024");
		assertEquals("0025", num);
		
		num = matricula.siguienteNumero("1239");
		assertEquals("1240", num);
	}

	@Test
	void testSiguientesLetras() {
		String let = matricula.siguientesLetras("FDH");
		assertEquals("FDJ", let);
		
		let = matricula.siguientesLetras("FBZ");
		assertEquals("FCB", let);
		
		let = matricula.siguientesLetras("FZZ");
		assertEquals("GBB", let);
	}

}
