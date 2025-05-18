package javadoc;

/**
 * {@summary Este enumerado implementará o abtraerá los tipos de trabajadores con
 *          su descripción corta y su función.}
 * 
 * 
 * 
 *          Las valores que ofrecemos son:
 *          <ul>
 *          <li>
 * 
 *          CONSERJE</li>
 *          <li>
 * 
 *          PROFESOR</li>
 *          </ul>
 *
 * 
 * @author Carlos Cano
 * @author Serena Lopez
 * @version 1.2
 * @since 1.0
 * 
 */

public enum EnumEmpleadosEducacion {

	/**
	 * CONSERJE representa el tipo de empleado conserje en el enumerado
	 * 
	 * @see CONSERJE
	 */
	CONSERJE(1, "Conserje", "Atended conserjeria"),
	/**
	 * PROFESOR representa el tipo de empleado profesor en el enumerado
	 * 
	 * @see PROFESOR
	 */
	PROFESOR(2, "Profesor", "Dar clase y preparar apuntes");

	
	/**
	 *  id del enumerado
	 *  
	 */
	private int id;
	
	/**
	 *  descCorta del enumerado en tipo cadena el valor del enumerado
	 *  
	 */
	private String descCorta;
	/**
	 *  La función del trabajador que representa el tipo enumerado 
	 *  
	 */
	private String funcion;

	EnumEmpleadosEducacion(int id, String descCorta, String funcion) {
		this.id = id;
		this.descCorta = descCorta;
		this.funcion = funcion;
	}

	/**
	 * Este método devuelve el id del enumerado elegido que representa un trabajador
	 * de educación
	 *
	 * @return El id del enumerado
	 * @version 1.2
	 * @since 1.0
	 * 
	 *
	 *
	 */

	public int getId() {
		return id;
	}

	/**
	 * Este método devuelve el la descripcion corta del enumerado
	 * 
	 * @return Una descripción corta del enumerado
	 * @version 1.2
	 * @since 1.0
	 *
	 *
	 */

	public String getDescCorta() {
		return descCorta;
	}

	/**
	 * Este método devuelve el la funcion del trabajador que representa el enumerado
	 * del enumerado
	 * 
	 * @return La función del trabajador que representa el enumerado
	 * @version 1.2
	 * @since 1.0
	 *
	 *
	 */
	public String getFuncion() {
		return funcion;
	}

}
