package masJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Multiplo3Test {
	
	
	//
	@Test
	public void testEsmultiplo3() {
		Multiplo3 m3 = new Multiplo3(-5);
		boolean resultado = m3.esmultiplo3();
		assertTrue(resultado);
	}

}
