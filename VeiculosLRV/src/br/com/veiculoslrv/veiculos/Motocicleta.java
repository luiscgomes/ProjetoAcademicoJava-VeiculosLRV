package br.com.veiculoslrv.veiculos;

public class Motocicleta extends Veiculo {
	private int cilindrada;
	private int capTanque;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapTanque() {
		return capTanque;
	}

	public void setCapTanque(int capTanque) {
		this.capTanque = capTanque;
	}
}
