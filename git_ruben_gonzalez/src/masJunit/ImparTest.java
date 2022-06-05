package masJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImparTest {
	
	
	@Test
	public void testEsimpar() {
		Impar nimpar = new Impar (5);
		boolean resultado = nimpar.esimpar();
		assertTrue(resultado);
	}

}
