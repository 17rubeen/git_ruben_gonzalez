package masJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MayorNumeroExcept {

	@Test
	public void testContarCadenas() {
		try {
			assertEquals(3,MayorNumero.obt_mayorNumero(new int [] { 1,2,3, 0%0 , })); /*"0/0" */
			}
			catch(ArithmeticException e){
	            System.out.println("no hay resto de 0 + no se puede dividir entre cero");
	        }
		
	}


}
