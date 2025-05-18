package javadoc;


/**
 * <h1>Clase Conserje</h1>
 * Esta clase implementará o abstraerá un tipo particular de trabajador en nuestra aplicación llamado conserje.
 * <p>Extiende a {@link Trabajador} e implementa {@linkplain SueldoTrabajadores} y {@linkplain ITipoTrabajadores}.</p>
 * 
 * @author Carlos Cano y Francisco
 * @version 1.0
 * @see Profesor
 * @see ITipoTrabajadores
 * @see SueldoTrabajadores
 */

public class Conserje extends Trabajador implements SueldoTrabajadores, ITipoTrabajadores {

	/**
	 * Constructor por defecto del Conserje.
	 */	
	public Conserje() {}
	
	/**
	 * Constructor con parametros del Conserje.
	 * 
	 * @param id identificador del conserje
     * @param nombre nombre del conserje
     * @param sueldo sueldo base del conserje
	 */
	public Conserje(int id, String nombre, double sueldo) {
		super(id,nombre,sueldo);
	
	}

	
	/**
	 * Devuelve la informacion del objeto como cadena de forma lineal.
     * <p>Incluye los atributos entre corchetes y el tipo de trabajador al principio.</p>
     * <p>Por ejemplo: Conserje [id=1, nombre=Paco, sueldo=2000, tipo=EnumEmpleadosEducacion.CONSERJE]</p>
	 * 
     * @return representacion textual del objeto
	 * @see EnumEmpleadosEducacion
	 */	
	@Override
	public String toString() {
		return "Conserje [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", tipo=" + this.getTipo() + "]";
	}

	/**
     * Retorna la función del trabajador dentro de la organización.
     * 
     * @return descripción de la función del conserje
	 * @see EnumEmpleadosEducacion#getFuncion()
     */
	@Override
	public String funcionTrabajador() {
		System.out.println(EnumEmpleadosEducacion.CONSERJE);
		
		return EnumEmpleadosEducacion.CONSERJE.getFuncion();
	}
	
	/**
     * Obtiene el tipo de empleado.
	 * <p>En este caso, {@linkplain EnumEmpleadosEducacion#CONSERJE}</p>
     * 
     * @return tipo de trabajador
	 * @see EnumEmpleadosEducacion
     */
	@Override
	public EnumEmpleadosEducacion getTipo() {
		return EnumEmpleadosEducacion.CONSERJE;
	}

}
