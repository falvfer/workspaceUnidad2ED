package javadoc;


import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import utilidades.Formatos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SueldoTrabajadores trab = new Conserje(1, "Mateo",15000.567576);
		
		SueldoTrabajadores prof = new Profesor(1, "Jesus",30000.35345);
		
		double totalImpuestos = trab.calculaImpuestos() + prof.calculaImpuestos();
		
		double totalSueldos = trab.calculaSueldo() + prof.calculaSueldo();
		
		
		System.out.println("Total  a pagar de impuestos: " + Formatos.formatoDoubles(totalImpuestos,3));
		
		System.out.println("Total a pagar de sueldos sin contar impuestos: " +Formatos.formatoDoubles(totalSueldos-totalImpuestos,2));
		
		System.out.println("Total a pagar: " + totalSueldos);
		
		String res =Formatos.inicialConMayusculas(" Carlos cano");
		
		System.out.println("Primera con mayusculas" + res);
		
		
		String s ="Micadena";
		List<String> lista = new ArrayList<String>();
		
		
		System.out.println(EnumEmpleadosEducacion.CONSERJE);
		System.out.println(EnumEmpleadosEducacion.CONSERJE.getDescCorta());
		
		
	}

}
