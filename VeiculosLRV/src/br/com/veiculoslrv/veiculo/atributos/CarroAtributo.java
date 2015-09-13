package br.com.veiculoslrv.veiculo.atributos;

public enum CarroAtributo implements Atributo {

	Cambio("cambio"), Motorizacao("motorizacao");

	public String nomeAtributo;

	CarroAtributo(String nome) {
		nomeAtributo = nome;

	}

}
