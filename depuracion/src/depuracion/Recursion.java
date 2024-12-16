package depuracion;

public class Recursion {

	public static long factorial(int num) {
		if (num == 1) return 1l;
		return num * factorial(num-1);
	}
	
	public static long factorial_aux(int num, int res) {
		if (num == 1) return res;
		return num * factorial_aux(num-1, num*res);
	}
	
	public static long factorial_mejorado(int num, int res) {
		return factorial_aux(num,1);
	}
	
	public static void main(String[] args) {
		
		factorial(5);
		
	}
	
}
