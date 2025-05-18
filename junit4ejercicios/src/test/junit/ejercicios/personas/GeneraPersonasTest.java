package test.junit.ejercicios.personas;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import junit.ejercicios.personas.GeneraPersonas;
import junit.ejercicios.personas.Persona;

public class GeneraPersonasTest {
	
	
	private List<Persona> listaPrueba;
	private int numPersonas= 10;
	
	@Before
	public void setup() {
		
		listaPrueba = GeneraPersonas.listaPersonas(numPersonas);
		
		
	}

	@Test
	public void listaPersonasTest() {
		
		assertNotNull(listaPrueba);
		assertTrue(numPersonas == listaPrueba.size());
		
		for (Persona persona : listaPrueba) {
			
			
			assertTrue(persona instanceof Persona);
			assertTrue(persona.getClass().equals(Persona.class));
		}
		
	}
	
	
	@After
	public void destroy() {
		
		listaPrueba= null;
		
		
	}

}
