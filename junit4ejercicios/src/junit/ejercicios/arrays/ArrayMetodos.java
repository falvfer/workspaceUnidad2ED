package junit.ejercicios.arrays;

import java.util.Random;

public class ArrayMetodos {

	// Devuelve un array de n enteros de 0 a n-1
	public static Integer[] arraynEnteros(int n) {

		Integer[] resultado = new Integer[n];

		for (int i = 0; i < n; i++) {

			resultado[i] = i;

		}

		return resultado;
	}

	
	

	public static Integer[] sumaOpuestos(Integer[] array) {

		Integer[] resultado = new Integer[array.length];

		int ultimaIteracion = 0;

		// si es par llegamos hasta la mitad
		if (resultado.length % 2 == 0)
			ultimaIteracion = resultado.length / 2;
		else
			// Si es impar la longitud hasta la mitad mas 1
			ultimaIteracion = resultado.length / 2 + 1;

		int suma = 0;

		for (int i = 0; i < ultimaIteracion; i++) {

			// el de delante
			// length 8
			// i=1
			// resultado[1] = array[1] + array[6]

			suma = array[i] + array[resultado.length - 1 - i];
			resultado[i] = suma;

			// el de detras
			// resultado[6] = array[6] + array[1]
			resultado[resultado.length - 1 - i] = suma;
		}

		return resultado;
	}

	// devuelve el array de la serie de fibonacci
	public static Integer[] arrayFibonacci(int n) {
		Integer[] resultado = new Integer[n + 1];

		rellenaConCeros(resultado);
		resultado[0] = 1;
		resultado[1] = 1;

		for (int i = 2; i < resultado.length; i++) {

			// resultado[i]=

		}

		return resultado;
	}

	// rellena el array recibido todo a ceros
	public static void rellenaConCeros(Integer[] array) {

		for (int i = 0; i < array.length; i++) {

			array[i] = 0;
		}

	}

	// metodo que sume dos arrays
	// 5 6 7 8 array1
	// 4 8 9 12 34 array2

	// 9 14 16 20 34 suma

	public static Integer[] sumaArrays(Integer[] array1, Integer[] array2) {
		Integer[] resultado;
		int maxTam = Math.max(array1.length, array2.length);
		int elem1, elem2 = 0;
		resultado = new Integer[maxTam];

		for (int i = 0; i < maxTam; i++) {
			elem1 = 0;
			elem2 = 0;

			if (i < array1.length) {

				elem1 = array1[i];
			}

			if (i < array2.length) {

				elem2 = array2[i];
			}

			resultado[i] = elem1 + elem2;
		}

		return resultado;
	}

	// llenar un array con l n primeros numeros pares
	// Deberes para casa
	// Haced con un while que cuente sólo los pares
	public static Integer[] arrayPares(int n) {
		Integer[] resultado;
		resultado = new Integer[n];

		return resultado;
	}

	public static Double[] rellenaArrayAleatorios(int numElementos, double maxDecimal) {

		Double[] resultado = new Double[numElementos];
		Random rand = new Random();
		// numero aleatorio entre 0 y maxdecimal que cambiarlo

		// rand.nextDouble() devuelve un decimal entre 0 y 1

		double decimalAleatorio = rand.nextDouble(0, maxDecimal);

		for (int i = 0; i < numElementos; i++) {

			resultado[i] = rand.nextDouble(0, maxDecimal);

		}

		return resultado;

	}



	public static Integer[] rellenaArrayAleatorios(int numElementos, int maxInt) {

		Integer[] resultado = new Integer[numElementos];
		Random rand = new Random();
		// numero aleatorio entre 0 y maxdecimal que cambiarlo
		rand.nextInt(0, maxInt);

		for (int i = 0; i < numElementos; i++) {

			resultado[i] = rand.nextInt(0, maxInt);

		}

		return resultado;

	}

	public static Integer[] invierteArray(Integer[] arrayParam) {

		Integer[] arrayResultado = new Integer[arrayParam.length];

		for (int i = 0; i < arrayParam.length; i++) {

			arrayResultado[arrayResultado.length - 1 - i] = arrayParam[i];

		}

		return arrayResultado;

	}

	public static Double[] invierteArray(Double[] arrayParam) {

		Double[] arrayResultado = new Double[arrayParam.length];

		for (int i = 0; i < arrayParam.length; i++) {

			arrayResultado[arrayResultado.length - 1 - i] = arrayParam[i];

		}

		return arrayResultado;

	}

	public static <T> void invierteArray(T[] arrayParam) {

		T aux;

		for (int i = 0; i < arrayParam.length / 2; i++) {

			aux = arrayParam[arrayParam.length - 1 - i];
			arrayParam[arrayParam.length - 1 - i] = arrayParam[i];
			arrayParam[i] = aux;

		}

	}

	// maximo generico

	public static <T extends Comparable> T maxInArray(T[] arrayParam) {

		T max = arrayParam[0];

		for (T item : arrayParam) {

			if (item.compareTo(max) > 0) {

				max = item;
			}

		}

		return max;

	}

	// minimo generico
	public static <T extends Comparable> T minInArray(T[] arrayParam) {

		T min = arrayParam[0];

		for (T item : arrayParam) {

			if (item.compareTo(min) < 0) {

				min = item;
			}

		}

		return min;

	}

}