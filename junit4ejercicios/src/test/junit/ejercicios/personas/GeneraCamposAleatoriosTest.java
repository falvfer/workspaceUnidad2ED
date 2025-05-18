package test.junit.ejercicios.personas;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import junit.ejercicios.personas.GeneraCamposAleatorios;

public class GeneraCamposAleatoriosTest {

	@Test
	public void testApellidos() {
		
		String apellidos = GeneraCamposAleatorios.getApellidosAleatorio();
		
		String[] apellidoSeparado = apellidos.split(" ");
		
		assertNotNull(apellidos);
		assertFalse(apellidos.isEmpty());
		
		
		assertTrue(Arrays.asList(GeneraCamposAleatorios.apellidos).contains(apellidoSeparado[0]));
		
		assertTrue(Arrays.asList(GeneraCamposAleatorios.apellidos).contains(apellidoSeparado[1]));
			
		
	}
	
	@Test
	public void testNombres() {
		
		String nombre = GeneraCamposAleatorios.getNombreAleatorio();
		
		assertNotNull(nombre);
		assertFalse(nombre.isEmpty());
		
		assertTrue(Arrays.asList(GeneraCamposAleatorios.nombres).contains(nombre));
		
	}
	
	@Test
	public void testEdad() {
		
		int edad= GeneraCamposAleatorios.getEdad();
		
		
		assertTrue( edad >=18 && edad <=100);
		
		
	}

}
