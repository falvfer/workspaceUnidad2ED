package javadoc;

/**
 * <h1>Clase Profesor</h1>
 * Clase que representa un profesor en el sistema educativo.
 * Extiende a {@link Trabajador} e implementa {@linkplain SueldoTrabajadores} y {@linkplain ITipoTrabajadores}.
 * <p>Un profesor tiene un identificador, un nombre, un sueldo y un tipo dentro del sistema.</p>
 * 
 * @author Francisco y Carlos
 * @version 1.0
 * @see Conserje
 * @see ITipoTrabajadores
 * @see SueldoTrabajadores
 */
public class Profesor extends Trabajador implements SueldoTrabajadores, ITipoTrabajadores {

// Constructores
	/**
	 * Constructor por defecto del profesor.
     * <p>Inicializa un objeto sin valores definidos.</p>
	 */	
	public Profesor() {
		
		
	}
	
	/**
	 * Constructor con parametros.
     * <p>Inicializa un profesor con los valores especificados.</p>
	 * 
	 * @param id el id del Profesor
	 * @param nombre el nombre del Profesor
	 * @param sueldo el sueldo base del Profesor
	 */	
	public Profesor(int id, String nombre, double sueldo) {
		super(id,nombre,sueldo);
	
	}

// toString
	/**
	 * Devuelve la informacion del objeto como cadena.
     * <p>Incluye los atributos y el tipo de trabajador.</p>
     * 
     * @return representacion textual del objeto
	 */	
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", tipo=" + this.getTipo() + "]";
	}

// Metodos publicos
	/**
	 * Calcula el sueldo del profesor.
     * <ul>
     *   <li>Se le añade un bono de 200€</li>
     *   <li>Se descuentan los impuestos</li>
     * </ul>
     * 
     * <p>Ejemplo de cálculo:</p>
     * <table border="1">
     *   <tr>
	 * 		<th>Sueldo Base</th>
	 * 		<th>Impuestos</th>
	 * 		<th>Bono</th>
	 * 		<th>Total</th>
	 * 	 </tr>
     *   <tr>
	 * 		<td>2000</td>
	 * 		<td>400</td>
	 * 		<td>200</td>
	 * 		<td>1800</td>
	 * 	 </tr>
     * </table>
     * 
     * @return sueldo total tras aplicar bonificaciones e impuestos
     * @see #calculaImpuestos()
     * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html">JDK 21 API - Math</a>
	 */	
	@Override
	public double calculaSueldo() {
		return sueldo + 200 - calculaImpuestos();
	}

	/**
     * Calcula los impuestos aplicados al sueldo del profesor.
     * 
     * @return importe de los impuestos (20% del sueldo base)
     */
	@Override
	public double calculaImpuestos() {
		return sueldo*0.20;
	}

	/**
     * Retorna la función del trabajador dentro de la organización.
     * 
     * @return descripción de la función del profesor
     */
	@Override
	public String funcionTrabajador() {
		return EnumEmpleadosEducacion.PROFESOR.getFuncion();
	}

	/**
     * Obtiene el tipo de empleado (en este caso, Profesor).
     * 
     * @return tipo de trabajador {@link EnumEmpleadosEducacion}
     */
	@Override
	public EnumEmpleadosEducacion getTipo() {
		return EnumEmpleadosEducacion.PROFESOR;
	}

	/**
     * <p><strong>Método en desuso.</strong></p>
     * Este método representaría una función obsoleta para poner notas.
     * 
     * @deprecated Este método ya no debe usarse. Utilizar métodos de evaluación modernos.
     */
    @Deprecated(since = "1.1", forRemoval = true)
    public void ponerNotas() {
        // Simulación de funcionalidad obsoleta
    }

}
