package introducao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testesoma {

	@Test
	void testSomar() {
		
		Soma Somador = new Soma();
		
		assertEquals(40, Somador.somar(10,30));
		assertEquals(20, Somador.somar(10,10));
		assertEquals(-30, Somador.somar(-10,-20));
	}

}
