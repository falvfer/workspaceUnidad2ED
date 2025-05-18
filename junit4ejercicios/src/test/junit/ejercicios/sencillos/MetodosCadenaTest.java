package test.junit.ejercicios.sencillos;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.ejercicios.sencillos.MetodosCadena;

@RunWith(Parameterized.class)
public class MetodosCadenaTest {

   private String entrada;
   private String resultado;

   public MetodosCadenaTest(String entrada, String resultado) {

       this.entrada = entrada;
       this.resultado = resultado;
   }

   @Parameters
   public static Collection<Object[]> cadenas() {
       return Arrays.asList(new Object[][] { { "valor", "rolav" }, { "ahora", "aroha" }, { "hola", "aloh" } });
   }

   @Test
   public void testReservo() {

       assertEquals(resultado, MetodosCadena.reverso(entrada));

   }

}