package junit.ejercicios.sencillos;
public class MetodosCadena {
	

		  public static String reverso(String s1) {

			  String s2="";

		    for(int i = s1.length()-1; i>=0; i--)
		    {
		        s2 = s2 + s1.charAt(i);
		    }

		  return s2;
		}

}
