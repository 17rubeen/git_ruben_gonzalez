package masJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperandosTest {

	@Test
	public void test() {
		Operandos md = new Operandos();
		boolean resultado = md.esmultiplode(15, 4);
		assertTrue(resultado);
	}

}
