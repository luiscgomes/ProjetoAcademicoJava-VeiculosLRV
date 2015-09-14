package br.com.veiculoslrv.veiculo.atributos;

public enum CarroAtributo implements Atributo {

	Cambio("Cambio"), Motorizacao("Motorização");

	public String nomeAtributo;

	CarroAtributo(String nome) {
		nomeAtributo = nome;
	}

}
