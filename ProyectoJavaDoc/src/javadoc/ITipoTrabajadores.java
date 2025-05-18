package javadoc;

/**
 * <h1>Interfaz ITipoTrabajadores</h1>
 * Esta interfáz se usará para obligar a implementar el metodo {@link #getTipo()} para las clases de los trabajadores.
 * 
 * <p>Es útil en casos donde se necesita identificar el tipo de trabajador como
 * {@linkplain EnumEmpleadosEducacion#PROFESOR Profesor} o {@linkplain EnumEmpleadosEducacion#CONSERJE Conserje}.</p>
 * 
 * @author Carlos Cano y Francisco
 * @version 1.0
 * @see EnumEmpleadosEducacion
 */
public interface ITipoTrabajadores {

	/**
	 * Este metodo se usará para devolver el tipo de trabajador
	 * 
	 * @return el tipo de trabajador según la enumeración {@link EnumEmpleadosEducacion}
	 */
	public EnumEmpleadosEducacion getTipo();

}
