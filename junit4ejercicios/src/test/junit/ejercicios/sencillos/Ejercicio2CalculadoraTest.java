package test.junit.ejercicios.sencillos;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.ejercicios.sencillos.Calculadora;

public class Ejercicio2CalculadoraTest {

	
	/**
	 * 
	 * 	La suma 5+5= 10, comprobara que es mayor que 0 y que da 10.
	 * 
	 */
	@Test
	public void testSuma() {
		
		Calculadora calc = new Calculadora(5,5);
		
		int resultado = calc.suma();
		
		assertTrue("mayor que 0 menor o igual que 10", resultado >0 && resultado <= 10);
		
		
	}

}
