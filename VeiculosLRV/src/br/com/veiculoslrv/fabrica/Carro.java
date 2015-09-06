package br.com.veiculoslrv.fabrica;

import java.util.HashMap;
import java.util.Map;


import br.com.veiculoslrv.veiculos.Especificacao;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class Carro extends Veiculo {
	public Carro() {
		Especificacao especificacao = new Especificacao();
		especificacao.setTipoVeiculo(TipoVeiculo.carro);

		Map<String, String> especificacoesMapa = new HashMap<String, String>();

		especificacao.setEspecificacoes(especificacoesMapa);
		this.setEspecificacao(especificacao);

	}

}
