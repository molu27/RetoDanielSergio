package reto;

public class funciones2 {

	
	public static int dividir(int a, int b) {
		b = 0;
		if (b==0) {
			return 0;
		}
		return a/b;
	}
	
	
	public static int multiplicar (int a, int b) {
		return a*b;
	}
	
	
	public static boolean esPositivo(int n) {
		if (n >= 0) {
			return true;
		}
		return false;
	}
	
	public static boolean esNegativo(int n) {
		if (n < 0) {
			return true;
		}
		return false;
	}
}

