package test.junit.ejercicios.entradadedatos.modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.ejercicios.entradadedatos.modelo.Autor;
import junit.ejercicios.entradadedatos.modelo.EnumLibro;
import junit.ejercicios.entradadedatos.modelo.LibroEducativo;

public class Ejercicio3LibroEducativoTest2 {
	
	private LibroEducativo libro1, libro2;
	
	

	
	@Before
	public void setup() {
		
		Autor autor = new Autor("Mario", "Cuadrado", "333993939");
		
		libro1 = new LibroEducativo("programacion"
									, autor
									, 2022 
									,"Paraninffo"
									,"593398484"
									, EnumLibro.EDUCATIVO, 
									"Informatica");
		
		libro2= libro1;
		
		
	}
	
	/**
	 * 
	 * Comprobar que el libro es no nulo. X
		Comprobar que la propiedad titulo no es una cadena vacía X
		Comprobar que la propiedad materia es un String y es no vacia. X
		Comprobar que el libro es de tipo Educativo X
		Comprobar que son la misma instancia
	 * 
	 * 
	 */

	@Test
	public void testLibroEducativo() {
		
		assertNotNull(libro1);
		
		assertFalse(libro1.getTitulo().isEmpty());
		assertTrue(libro1.getMateria() instanceof String);
		assertTrue(libro1.getMateria().getClass().equals(String.class));
		assertTrue(libro1.getTipoLibro().equals(EnumLibro.EDUCATIVO));
		assertSame(libro1, libro2);
	}
	
	
	@After
	public void destroy() {
		
		libro1=null;
		libro2= null;
	}
	
	
		
	
		
	

}
