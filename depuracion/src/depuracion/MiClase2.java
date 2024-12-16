package depuracion;

public class MiClase2 {
	
	private static int contadorObjetos;
	private String nombre;
	
	static {
		contadorObjetos = 0;
	}
	
	public MiClase2(String nombre) {
		this.nombre = nombre;
		MiClase2.contadorObjetos++;
	}

	public static int getContadorObjetos() {return contadorObjetos;}
	public static void setContadorObjetos(int contadorObjetos) {MiClase2.contadorObjetos = contadorObjetos;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName().toUpperCase()
				+ " -> Nombre: " + this.nombre;
	}
	
	public void func2() {
		String nombreFuncion = "func2";
		System.out.println("Soy la " + nombreFuncion);
	}
	
}
