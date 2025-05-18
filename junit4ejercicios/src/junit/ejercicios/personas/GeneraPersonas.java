package junit.ejercicios.personas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class GeneraPersonas {

	public static Persona generaPersona() {

		return new Persona(
				GeneraCamposAleatorios.getNombreAleatorio() + " " + GeneraCamposAleatorios.getApellidosAleatorio(),
				GeneraCamposAleatorios.getEdad());
	}

	public static List<Persona> listaPersonas(int tamanyo) {

		List<Persona> listaPersonas = new ArrayList<Persona>();

		for (int i = 0; i < tamanyo; i++) {

			listaPersonas.add(generaPersona());
		}

		return listaPersonas;
	}

	/**
	 * devuelve una lista con los nombres que contienen
	 * 
	 * @param subcadena
	 * @return List
	 */

	public static List<Persona> personasNombre(List<Persona> lista, String subcadena) {
		List<Persona> resultado = new ArrayList<Persona>();

		for (Persona persona : lista) {

			if (persona.getNombre().contains(subcadena)) {

				resultado.add(persona);
			}
		}

		return resultado;
	}

	/**
	 * devuelve una lista con los persona de edad mayor o igual que
	 * 
	 * @param edad
	 * @return List
	 */

	public static List<Persona> personasEdad(List<Persona> lista, int edad) {

		List<Persona> listaPersonasEdad = new ArrayList<Persona>();
		
		for (Persona persona : lista) {
			
			if (persona.getEdad()>=edad)
				listaPersonasEdad.add(persona);
		}
		
		
		return listaPersonasEdad;
		
		
	}

	/**
	 * devuelve la edad máxima de las personas en la lista
	 * 
	 * @return List
	 */

	public static int edadMaxima(List<Persona> lista) {

		return 0;
	}

	/**
	 * devuelve lista con personas de edad máxima
	 * 
	 * @return List
	 */

	public static List<Persona> personasEdadMaxima(List<Persona> lista) {

		return null;
	}

	/**
	 * devuelve la edad mínima de las personas en la lista
	 * 
	 * @return List
	 */

	public static int edadMinima(List<Persona> lista) {

		return 0;
	}

	/**
	 * devuelve una lista con los persona de edad minima
	 * 
	 * @return List
	 */

	public static List<Persona> personasEdadMinima(List<Persona> lista) {

		return null;
	}

	/**
	 * devuelve una set con tamanyo personas aleatorias
	 * 
	 * @return Set
	 */

	public static Set<Persona> setPersona(int tamanyo) {

		return null;

	}

	/**
	 * devuelve una set con tamanyo personas aleatorias
	 * 
	 * @return HashMap
	 */

	public static HashMap<Integer, Persona> mapPersonas(int tamanyo) {

		return null;
	}

}

