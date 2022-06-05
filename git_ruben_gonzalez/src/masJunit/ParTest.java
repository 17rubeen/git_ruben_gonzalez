package masJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParTest {

	@Test
	public void testEspar() {
		Par npar = new Par (0);
		boolean resultado = npar.espar();
		assertTrue(resultado);
	}

}
