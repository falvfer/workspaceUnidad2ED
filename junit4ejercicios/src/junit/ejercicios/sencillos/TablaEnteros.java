package junit.ejercicios.sencillos;

public class TablaEnteros {
	  private Integer[] tabla;

	  public TablaEnteros(int n) {
		tabla= llenar(n);
	  }
	  
		private  Integer[] llenar(int n) {
			Integer[] tabla = new Integer[n];
			for (int i = 0; i < n; i++)
				tabla[i] = i + 10;
			return tabla;
		}// llenar tabla
	  
	  //devuelve la suma de los elementos de la tabla
	  public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
		  suma += tabla[i];
		return suma;
	  }
	  //devuelve la suma de los elementos de la tabla
	  public int sumaTabla(Integer[] tabla) {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
		  suma += tabla[i];
		return suma;
	  }

	  //devuelve el mayor elemento de la tabla
	  public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
		  if (tabla[i] > max)
			max = tabla[i];
		return max;
	  }

	  //devuelve el mayor elemento de la tabla
	  public int mayorTabla(Integer[] tabla) {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
		  if (tabla[i] > max)
			max = tabla[i];
		return max;
	  }

	  //devuelve la posición de un elemento cuyo valor se pasa
	  public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
		  if (tabla[i] == n)
			return i;
		throw new java.util.NoSuchElementException("No existe:" + n);
	  }


	  //devuelve la posición de un elemento cuyo valor se pasa
	  public int posicionTabla(Integer[] tabla ,int n) {
		for (int i = 0; i < tabla.length; i++)
		  if (tabla[i] == n)
			return i;
		throw new java.util.NoSuchElementException("No existe:" + n);
	  }
	}//
