package br.com.veiculoslrv.veiculos;

import java.util.Map;

import br.com.veiculoslrv.veiculo.atributos.Atributo;

public class Especificacao {
	private Map<Atributo, String> especificacoes;
	private TipoVeiculo tipoVeiculo;

	public Especificacao(TipoVeiculo tipoVeiculo) {

		this.tipoVeiculo = tipoVeiculo;
	}

	public Map<Atributo, String> getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(Map<Atributo, String> especificacoes) {
		this.especificacoes = especificacoes;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especificacoes == null) ? 0 : especificacoes.hashCode());
		result = prime * result + ((tipoVeiculo == null) ? 0 : tipoVeiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especificacao other = (Especificacao) obj;
		if (especificacoes == null) {
			if (other.especificacoes != null)
				return false;
		} else if (!especificacoes.equals(other.especificacoes))
			return false;
		if (tipoVeiculo != other.tipoVeiculo)
			return false;
		return true;
	}
	
}
