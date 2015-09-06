package br.com.veiculoslrv.fabrica;

import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class FabricaVeiculo {

	public Veiculo criarVeiculo(TipoVeiculo veiculo) {
		switch (veiculo) {
		case carro:
			return new Carro();
		case motocicleta:
			return new Moto();
		default:
			throw new IllegalArgumentException("Tipo Invalido");
		}
	}
}
