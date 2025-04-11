package utilidades;

/**
 * Esta clase se usará para dar formato a distintos valores.
 */
public class Formatos {


	
	/**
	 * 
	 * <p>
	 * Este método devuelve el decimal redondeado con los decimales indicados
	 * </p>
	 * {@linkplain Math#round(double)	 *}
	 * @param numero recibimos un decimal double
	 * @param numeroDecimales y el numero de decimales donde queremos redondear
	 * 
	 * @return double el numero decimal redondeado numeroDecimales
	 * 
	 * 
	 * @see Math
	 */
	
	
	
	public static double formatoDoubles(double numero, Integer numeroDecimales) {
		
		
		   
		
			return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
			
		
	}
	
	
	/**
	 * 
	 * <p>
	 * Este método recorre el nombre con los apellidos y escribe la primera letra con 
	 * mayuscula para cada nombre y apellido
	 * </p>
	 * 
	 * <p>
	 * usamos la API String{@linkplain String}
	 * mirar el método trim{@link String#trim}
	 * 
	 * </p>
	 * @param Nombre Un nombre con el nombre y apellidos separados por blancos
	 * 
	 * @return String el nombre y apellidos con las Iniciales en mayuscula
	 * 
	 * @see java.lang.String
	 */
	
	
	public static String inicialConMayusculas(String Nombre) {
		
		String trimNombre = Nombre.trim();
		
		String tratarNombre[] =trimNombre.split(" ");
		String Resultado ="";
		
		
		for (String s : tratarNombre) {
			
			
			
			Resultado = Resultado + s.trim().substring(0,1).toUpperCase() + s.trim().substring(1) +" "; 
		}
		
		return Resultado.trim();
		
		
	}

}
