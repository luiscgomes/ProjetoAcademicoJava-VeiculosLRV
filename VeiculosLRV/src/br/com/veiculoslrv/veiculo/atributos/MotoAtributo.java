package br.com.veiculoslrv.veiculo.atributos;

public enum MotoAtributo  implements Atributo {
	Cilindrada("Cilindrada"), CapacidadeTanque("Capacidade do tanque");
	
	public String nomeAtributo;

	MotoAtributo(String nome) {
		nomeAtributo = nome;
	}

}
