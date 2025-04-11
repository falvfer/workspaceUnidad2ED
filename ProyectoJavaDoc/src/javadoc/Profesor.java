package javadoc;

public class Profesor extends Trabajador implements SueldoTrabajadores, ITipoTrabajadores {

	
	public Profesor() {
		
		
	}
	
	public Profesor(int id, String nombre, double sueldo) {
		super(id,nombre,sueldo);
	
	}

	




	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", tipo=" + this.getTipo() + "]";
	}

	@Override
	public double calculaSueldo() {
		// TODO Auto-generated method stub
		
		
		return sueldo + 200 - calculaImpuestos();
	}

	@Override
	public double calculaImpuestos() {
		// TODO Auto-generated method stub
		return sueldo*0.20;
	}

	@Override
	public String funcionTrabajador() {
		// TODO Auto-generated method stub
		return EnumEmpleadosEducacion.PROFESOR.getFuncion();
	}

	@Override
	public EnumEmpleadosEducacion getTipo() {
		// TODO Auto-generated method stub
		return EnumEmpleadosEducacion.PROFESOR;
	}
	
	
	
	
	
	
	

}
