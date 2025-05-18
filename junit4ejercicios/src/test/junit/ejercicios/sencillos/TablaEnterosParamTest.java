package test.junit.ejercicios.sencillos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.ejercicios.sencillos.TablaEnteros;

@RunWith(Parameterized.class)
public class TablaEnterosParamTest {
	
	private Integer[] tabla;
	private int resultado;
	
	public TablaEnterosParamTest(Integer[] tabla, int resultado) {
		
		this.tabla = tabla;
		this.resultado = resultado;
	}
	
	
	@Parameters
	public static Collection<Object[]> arraysPrueba() {
		
		List<Object[]> listaArrays= new ArrayList<Object[]>();
		
		Integer[] arrayEntrada= {1,2,3,4};
		Integer[] arrayEntrada2= {10,20,30,40};
		
		
		listaArrays.add(new Object[]{arrayEntrada,10});
		
		listaArrays.add(new Object[]{arrayEntrada2,100});
		
		return listaArrays;
		
		
	}
	
	@Test
	public void testSumaConParam() {
		
		TablaEnteros tb = new TablaEnteros(2);
		
		
		assertEquals(resultado, tb.sumaTabla(tabla));
		
		int i= 0;
		
	}



}
