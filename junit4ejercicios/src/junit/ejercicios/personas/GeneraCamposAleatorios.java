package junit.ejercicios.personas;

import java.util.Random;


public class GeneraCamposAleatorios {
	
	public static final String nombres[] = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
			"CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
			"PAULA", "ELENA", "MARIA LUISA", "RAQUEL"};

	public static final String apellidos[] = {"García", "Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez",
			"Martin", "Jimenez", "Ruiz", "Hernandez", "Diaz", "Moreno", "Muñoz", "Alvarez", "Romero", "Alonso", "Gutierrez", "Navarro",
			"Torres", "Dominguez", "Vazquez", "Ramos", "Gil", "Ramirez", "Serrano", "Blanco", "Molina", "Morales", "Suarez", "Ortega",
			"Delgado", "Castro", "Ortiz", "Rubio", "Marin", "Sanz", "Nuñez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos"};

	
	private static Integer numeroAleatorio (int min,int max)  {
		
		
		return new Random().nextInt(max-min) + min ;
	}
	private static Double decimalAleatorio(int min,int max) {
		
		return new Random().nextDouble()*(max-min) + min  ;
	}

	public static String getNombreAleatorio() {
		
		
		return nombres[numeroAleatorio(0, nombres.length-1)];
	}
	
	
	//Devuelve dos apellidos del array separados por una 
	public static String getApellidosAleatorio() {
		
		
		return apellidos[numeroAleatorio(0, apellidos.length-1)] + " " 
				+ apellidos[numeroAleatorio(0, apellidos.length-1)];
	}
	

	public static int getEdad() {
		
		return numeroAleatorio(18, 100);
	}
	

	
	

}
