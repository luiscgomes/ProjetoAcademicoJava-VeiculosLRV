package br.com.veiculoslrv.fabrica;

import br.com.veiculoslrv.veiculos.Especificacao;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class FabricaVeiculo {

	public Veiculo criarVeiculo(TipoVeiculo tipoVeiculo) {
		Veiculo veiculo = new Veiculo();
		Especificacao especificacao = new Especificacao();
		
		especificacao.setTipoVeiculo(tipoVeiculo);
		
		return veiculo;
	}
}
