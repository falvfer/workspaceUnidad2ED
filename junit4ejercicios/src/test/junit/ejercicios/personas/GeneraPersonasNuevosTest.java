package test.junit.ejercicios.personas;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.ejercicios.personas.GeneraPersonas;
import junit.ejercicios.personas.Persona;

public class GeneraPersonasNuevosTest {
	
	
	private List<Persona> listaPersonasEdad;	
	private final int EDAD_PROBAR =25;
	@Before
	public void setup() {
		
		List<Persona> listaPersonas = GeneraPersonas.listaPersonas(30);
		
		listaPersonasEdad = GeneraPersonas.personasEdad(listaPersonas, EDAD_PROBAR);
		
		
	}

	@Test
	public void personasEdadTest() {
		
		assertNotNull(listaPersonasEdad);
		
		
		for (Persona persona: listaPersonasEdad ) {
			
			assertTrue(persona.getEdad()>= EDAD_PROBAR);
		}
		
		int edadMinima= Collections.min(listaPersonasEdad, Comparator.comparingInt(Persona::getEdad)).getEdad();
		
		assertTrue(edadMinima >= EDAD_PROBAR);
		
	}
	
	@After
	
	public void destroy() {
		
		listaPersonasEdad= null;
		
	}

}
