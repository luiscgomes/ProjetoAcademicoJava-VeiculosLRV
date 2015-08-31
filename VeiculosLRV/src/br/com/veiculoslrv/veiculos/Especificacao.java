package br.com.veiculoslrv.veiculos;

import java.util.HashMap;
import java.util.Map;

public class Especificacao {
	Map<String, String> especificacoes;
	TipoVeiculo tipoVeiculo;
	
	public Map<String, String> getEspecificacoes() {
		return especificacoes;
	}
	public void setEspecificacoes(Map<String, String> especificacoes) {
		this.especificacoes = especificacoes;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
		
}
