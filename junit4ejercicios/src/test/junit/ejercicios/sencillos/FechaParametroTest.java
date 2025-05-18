package test.junit.ejercicios.sencillos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.ejercicios.sencillos.Fecha;

@RunWith(Parameterized.class)
public class FechaParametroTest {
	private int tipo;
	private String result;

	
	
	
	public FechaParametroTest(int tipo, String result) {
		
		this.tipo = tipo;
		this.result = result;
	}



	@Parameters
	public static Collection<Object[]> fechas() {
		
		List<Object[]> listaParam = new ArrayList<>();
		
		listaParam.add( new Object[]{1,"18.05.2025"});
		
		listaParam.add( new Object[]{2,"18:05:2025"});
		
		listaParam.add( new Object[]{3,"18-05-2025"});
		listaParam.add( new Object[]{4,"ERROR"});
		
		
		return listaParam;
		
		
		
		
	}	

	@Test
	public void testFecha() {
		Fecha fecha = new Fecha();
		
		assertEquals(result,fecha.DevuelveFecha(tipo));
		
		
	}

}
