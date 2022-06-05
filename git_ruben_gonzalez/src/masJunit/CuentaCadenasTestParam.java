package masJunit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CuentaCadenasTestParam {
	String a;
	String b;
	int resul;
	
	
	public CuentaCadenasTestParam(String a, String b, int resul) {
		this.a = a;
		this.b = b;
		this.resul = resul;
	}
	
	@Parameters
	 public static Collection<Object[]> numeros() {
	    	return Arrays.asList(new Object[][] {
	    		{ "pez", "pez pez pez", 3 },  
	    		{ "PEZ", "PEZ PEZ", 2 }, 
	    		{ "2020", "2020", 1 },
	    		{ "-", "---", 3 }, 
	    		{ "pez", "gatogato", 0 }});
	    	}
	
	@Test
	public void test() {
		int resultado = CuentaCadenas.contarCadenas(a, b);
		assertEquals(resul,resultado);
	}

}
