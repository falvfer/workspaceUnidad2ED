package depuracion;

public class MiClase {
	
	private static int contadorObjetos;
	private String nombre;
	
	static {
		contadorObjetos = 0;
	}
	
	public MiClase(String nombre) {
		this.nombre = nombre;
		MiClase.contadorObjetos++;
	}

	public static int getContadorObjetos() {return contadorObjetos;}
	public static void setContadorObjetos(int contadorObjetos) {MiClase.contadorObjetos = contadorObjetos;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName().toUpperCase()
				+ " -> Nombre: " + this.nombre;
	}
	
	public void func1() {
		String nombreFuncion = "func1";
		System.out.println("Soy la " + nombreFuncion);
	}
	
}
