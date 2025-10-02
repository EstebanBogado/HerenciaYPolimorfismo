package ar.edu.unlam.alumno.pb2.secuenciaTDD;

public class SecuenciaTDD {

	private static int[] fibonacci;

	public SecuenciaTDD() {

	}

	public static int calcular(int numero) {
		return numero;
	}

	public static void serieFibonacci(int serie) {

		fibonacci = new int[serie]; 
		int n1 = 1;
		// serie fibonacci: 0, 1, 1, 2, 3, 5, 8, 13
		
		fibonacci[0] = 0;

		System.out.println(fibonacci[0]);

		for (int i = 1; i < serie; i++) {
			fibonacci[i] = fibonacci[i - 1] + n1;
			n1 = fibonacci[i - 1];
			System.out.println(fibonacci[i]);
		}

	}

	public static int getFibonacci(int i) {
		return fibonacci[i];
	}

}
