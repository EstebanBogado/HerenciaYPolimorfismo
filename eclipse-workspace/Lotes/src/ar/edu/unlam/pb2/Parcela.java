package ar.edu.unlam.pb2;

public class Parcela {
	private Cultivo cultivo;
	private boolean estaRegada;
	private boolean estaListoParaCosechar;

	public boolean estaLibre() {
		return this.cultivo == null;
	}



	public void cultivar(Cultivo cultivo) {
		if (this.estaLibre()) {
			this.cultivo = cultivo;
		}
	}

	public boolean hayCultivo() {
		return !this.estaLibre();
	}

	public void regar() {
		if (this.hayCultivo()) {
			this.estaRegada = true;
		}
	}



	public boolean estaRegada() {
		return this.estaRegada;
	}



	public void pasarDia() {
		if (this.hayCultivo()
			&& this.estaRegada()) {
			this.estaListoParaCosechar = true;
		}
		this.estaRegada = false;
	}



	public Cultivo cosechar() {
		if (this.hayCultivo()
			&& this.estaListoParaCosechar) {
			Cultivo cultivoCosechado = this.cultivo;
			this.cultivo = null;
			return cultivoCosechado;
		}
			
		return null;
	}
	
	

}
