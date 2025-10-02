package ar.edu.unlam.alumno.pb2.holaMundo;

public class HolaMundo {

	private double doble;
	private int entero;

	public HolaMundo() {

	}

	public void setDoble(double doble) {
		this.doble = doble;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	public double getDoble() {
		return doble;
	}

	public int getEntero() {
		return entero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo!");

		int[] enteros = new int[5];

		HolaMundo prueba[] = new HolaMundo[5];

		for (int i = 0; i < prueba.length; i++) {
			prueba[i] = new HolaMundo();
			prueba[i].setDoble(i + 1.2);
			prueba[i].setEntero(i + 20);
		}

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = i + 3;
		}

		for (int i = 0; i < prueba.length; i++) {
			System.out.println(prueba[i].getDoble());
			System.out.println(prueba[i].getEntero());
		}
		System.out.println("tamaño " + enteros.length);
		System.out.println("CHAU CHAU CHAU!!!");
	}

}
