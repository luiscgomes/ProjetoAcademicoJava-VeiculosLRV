package br.com.veiculoslrv.veiculos;

import java.util.Map;

import br.com.veiculoslrv.veiculo.atributos.Atributo;

public class Especificacao {
	Map<Atributo, String> especificacoes;
	TipoVeiculo tipoVeiculo;

	public Map<Atributo, String> getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(Map<Atributo, String> especificacoes) {
		this.especificacoes = especificacoes;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

}
