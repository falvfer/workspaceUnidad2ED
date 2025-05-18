package junit.ejercicios.personas;

import java.util.Objects;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre,int edad)	{
	  this.nombre=nombre;
	  this.edad=edad;	
	 }
	
	public Persona() {
	  this.nombre=null;	  
	 }	
	public void setNombre(String nom){nombre=nom;}
	public void setEdad(int ed){edad=ed;}
	
	public String getNombre(){return nombre;}
	public int getEdad(){return edad;}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}


	@Override
	public boolean equals(Object obj) {
	
		Persona other = (Persona) obj;
		return this.getNombre().equals(other.getNombre());
	}	
	
		
}//fin Persona
