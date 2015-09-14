package br.com.veiculoslrv.fabrica;

import br.com.veiculoslrv.veiculos.Especificacao;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class FabricaVeiculo {

	public static Veiculo criarVeiculo(TipoVeiculo tipoVeiculo) {

		Especificacao especificacao = new Especificacao(tipoVeiculo);		
		Veiculo veiculo = new Veiculo(especificacao);
		return veiculo;
	}
}
