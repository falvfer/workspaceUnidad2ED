package test.junit.ejercicios.validaciones;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.ejercicios.validaciones.Validaciones;

class ValidacionesTest {

	@Test
	void esEnteroFuncionaTest() {
		assertTrue( Validaciones.esEntero("34"));
	}

	
	@Test
	void esEnteroNoFuncionaTest() {
		
		assertFalse(Validaciones.esEntero("3j"));
	}
	
	
	@Test
	void esDecimalFuncionaTest() {
	
	}
	
	@Test
	void esNoDecimalFuncionaTest() {
	
	}
}
