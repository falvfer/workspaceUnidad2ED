package test.junit.ejercicios.validaciones;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.ejercicios.validaciones.Validaciones;

@RunWith(Parameterized.class)
public class ValidacionesParametrizadoTest {

	private String parametroEntrada;
	private boolean resultado;

	public ValidacionesParametrizadoTest(String parametroEntrada, boolean resultado) {

		this.parametroEntrada = parametroEntrada;
		this.resultado = resultado;
	}

	@Parameters
	public static Collection<Object[]> cadenasPrueba() {

		return Arrays.asList(new Object[][] { { "djadjkd", true }, { "djdfd7444", false }

		});

	}

	@Test
	public void cadenaLetrasTest() {

		assertEquals(resultado, Validaciones.compruebaLetrasCadena(parametroEntrada));
	}

}
