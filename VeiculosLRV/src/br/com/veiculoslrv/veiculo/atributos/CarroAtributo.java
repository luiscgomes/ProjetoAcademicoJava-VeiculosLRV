package br.com.veiculoslrv.veiculo.atributos;

public enum CarroAtributo implements Atributo {

	Cambio("Cambio"), Motorizacao("Motoriza��o");

	public String nomeAtributo;

	CarroAtributo(String nome) {
		nomeAtributo = nome;
	}

}
