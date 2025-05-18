package test.junit.ejercicios.sencillos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.ejercicios.sencillos.TablaEnteros;

public class TablaEnterosTest {

	private TablaEnteros tablaPrueba;
	
	private Integer[] tabla;
	private int n = 4;

	@Before
	public void setup() {

		tablaPrueba = new TablaEnteros(n);
		tabla = new Integer[] {1,2,3,4};

		int i = 0;

	}

	@Test
	public void sumaTablaTest() {

		assertEquals(46, tablaPrueba.sumaTabla());
		
		

	}
	
	@Test
	public void sumaTablaParamTest() {
		
		assertEquals(10, tablaPrueba.sumaTabla(tabla));
	
	}

}
