package depuracion;

public class VariableEjemplos {

	public static void main(String[] args) {

		int mivar;
		
		MiClase miClase;
		MiClase2 miClase2;
		
		int miNum = 5;
		int tuNum = miNum + 7;// Integer (número entero)
		float miFloatNum = 5.99f;
		double miDouble = 0.0d;
		mivar = 2;
		
		boolean respuesta = true;

		char letraMinuscula = 'c';

		respuesta = false;

		miDouble = miFloatNum + miNum;

		miClase = new MiClase("Clase 1");
		miClase2 = new MiClase2("Clase 2");
		miClase.func1();
		miClase2.func2();
		
		
	}

}