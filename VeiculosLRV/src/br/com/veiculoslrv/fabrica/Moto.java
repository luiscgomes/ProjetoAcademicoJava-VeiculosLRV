package br.com.veiculoslrv.fabrica;

import java.util.HashMap;
import java.util.Map;

import br.com.veiculoslrv.veiculos.Especificacao;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class Moto extends Veiculo {
	public Moto() {
		Especificacao especificacao = new Especificacao();
		especificacao.setTipoVeiculo(TipoVeiculo.motocicleta);

		Map<String, String> especificacoesMapa = new HashMap<String, String>();

		especificacao.setEspecificacoes(especificacoesMapa);
		this.setEspecificacao(especificacao);

	}

}
