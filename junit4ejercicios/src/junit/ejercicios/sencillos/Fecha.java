package junit.ejercicios.sencillos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Fecha {
	DateTimeFormatter formato;
	LocalDate hoy;
	
	public Fecha() {
		hoy = LocalDate.now();
	}

	public String DevuelveFecha(int tipo) {
		String cad = "";
		switch (tipo) {
		case 1: {
			formato = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			cad = formato.format(hoy);
			break;
		}
		case 2: {
			formato = DateTimeFormatter.ofPattern("dd:MM:yyyy");
			cad = formato.format(hoy);
			break;
		}
		case 3: {
			formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			cad = formato.format(hoy);
			break;
		}
		default: {
			cad = "ERROR";
		}
		}
		return cad;
	}
}//
