package ar.edu.unlam.pb2;

public class Terreno {
	private Parcela[][] parcelas;
	private Cultivo[] depositoCultivos;
	
	private static final int CANTIDAD_CULTIVOS_EXITOSOS = 100;
	
	public Terreno(int filas, int columnas) {
		this.parcelas = new Parcela[filas][columnas];
		
		for (int i =0; i < filas; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				this.parcelas[i][j] = new Parcela();
			}
		}
		this.depositoCultivos = new Cultivo[CANTIDAD_CULTIVOS_EXITOSOS];
		
	}

	public int getTotalParcelas() {
		return this.parcelas[0].length * this.parcelas.length;
	}

	public int getTotalParcelasLibres() {
		int contador = 0;
		for (int i =0; i < this.parcelas.length; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				Parcela parcela = this.parcelas[i][j];
				if (parcela.estaLibre()) {
					contador++;
				}
			}
		}
		return contador;
	}

	public int getTotalParcelasOcupadas() {
		return this.getTotalParcelas() - this.getTotalParcelasLibres();
	}
	
	public void plantarTomate(int cantidad) {
		if (cantidad > this.getTotalParcelasLibres()) {
			return;
		}
		int contador = 0;
		for (int i =0; i < this.parcelas.length; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				Parcela parcela = this.parcelas[i][j];
				if (parcela.estaLibre()) {
					parcela.cultivar(new Tomate());
					contador++;
					if (contador == cantidad) {
						return;
					}
				}
			}
		}
	}
	
	public void plantarTrigo(int cantidad) {
		if (cantidad > this.getTotalParcelasLibres()) {
			return;
		}
		int contador = 0;
		for (int i =0; i < this.parcelas.length; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				Parcela parcela = this.parcelas[i][j];
				if (parcela.estaLibre()) {
					parcela.cultivar(new Trigo());
					contador++;
					if (contador == cantidad) {
						return;
					}
				}
			}
		}
	}
	
	public void plantarMaiz(int cantidad) {
		if (cantidad > this.getTotalParcelasLibres()) {
			return;
		}
		int contador = 0;
		for (int i =0; i < this.parcelas.length; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				Parcela parcela = this.parcelas[i][j];
				if (parcela.estaLibre()) {
					parcela.cultivar(new Maiz());
					contador++;
					if (contador == cantidad) {
						return;
					}
				}
			}
		}
	}

	public void pasarDia() {
		for (int i =0; i < this.parcelas.length; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				Parcela parcela = this.parcelas[i][j];
				parcela.pasarDia();
			}
		}
	}

	public void cosechar() {
		for (int i =0; i < this.parcelas.length; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				Parcela parcela = this.parcelas[i][j];
				Cultivo cultivo = parcela.cosechar();
				if (cultivo != null) {
					this.agregarCultivoAlDeposito(cultivo);
				}
			}
		}
		
	}
	
	private void agregarCultivoAlDeposito(Cultivo cultivo) {
		for (int i = 0; i < this.depositoCultivos.length; i++) {
			if (this.depositoCultivos[i] == null) {
				this.depositoCultivos[i] = cultivo;
				return;
			}
		}
	}

	public int getCantidadCultivosEnDeposito() {
		int contador = 0;
		for (int i = 0; i < this.depositoCultivos.length; i++) {
			if (this.depositoCultivos[i] != null) {
				contador++;
			}
		}
		return contador;
	}
	
	public void regar() {
		for (int i =0; i < this.parcelas.length; i++) {
			Parcela[] fila = this.parcelas[i];
			for(int j = 0; j < fila.length; j++) {
				Parcela parcela = this.parcelas[i][j];
				parcela.regar();
			}
		}
	}
	

}
