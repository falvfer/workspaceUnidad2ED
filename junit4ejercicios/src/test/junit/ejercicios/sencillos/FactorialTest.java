package test.junit.ejercicios.sencillos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junit.ejercicios.sencillos.Factorial;

/**
 * <h1>Testeo de la clase Factorial</h1>
 * Esta clase contiene unos cuantos metodos a ejecutar con JUnit
 * para probar el correcto funcionamiento de la clase {@link Factorial}.
 * 
 * @author Francisco
 * @version 1.0
 * @see Factorial#calculo(int)
 */
public class FactorialTest {

	/**
	 * Este metodo prueba que el factorial de 0 es igual a 1.
	 */
	@Test
	public void pruebaFact0() {
		assertEquals(1, Factorial.calculo(0));
	}

	/**
	 * Este metodo prueba varios factoriales positivos.
	 */
	@Test
	public void pruebaFactPositivos() {
		assertEquals(120, Factorial.calculo(5));
		assertEquals(1, Factorial.calculo(1));
		assertEquals(6, Factorial.calculo(3));
		assertEquals(3628800, Factorial.calculo(10));
	}

	/**
	 * Este metodo prueba que el factorial de un número negativo lance la excepcion
	 * {@link IllegalArgumentException}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void pruebaFactNegativo() {
		Factorial.calculo(-5);
	}

	/**
	 * Este metodo prueba que el factorial de un número grande lance la excepcion
	 * {@link ArithmeticException}
	 */
	@Test(expected = ArithmeticException.class)
	public void pruebaFactGrande() {
		Factorial.calculo(30);
	}
	
}
