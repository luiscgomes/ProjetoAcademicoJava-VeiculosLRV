package br.com.veiculoslrv.veiculos;

import java.util.HashMap;

public class Especificacao {
	HashMap<String, String> especificacoes;
	TipoVeiculo tipoVeiculo;
	
	public HashMap<String, String> getEspecificacoes() {
		return especificacoes;
	}
	public void setEspecificacoes(HashMap<String, String> especificacoes) {
		this.especificacoes = especificacoes;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
		
}
