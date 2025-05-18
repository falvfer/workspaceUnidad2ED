package test.junit.ejercicios.sencillos;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.ejercicios.sencillos.Fecha;

public class FechaTest {

	@Test
	public void testFecha1() {
		
		
		Fecha fecha = new Fecha();
		
		
		assertEquals("09.05.2025",fecha.DevuelveFecha(1));
		
		int i =0;
	}
	
	@Test
	public void testFecha2() {
	
	}
	
	@Test
	public void testFechaError() {
	
	}

}
