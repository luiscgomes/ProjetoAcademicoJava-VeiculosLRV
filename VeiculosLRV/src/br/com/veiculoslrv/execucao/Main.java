package br.com.veiculoslrv.execucao;

import br.com.veiculoslrv.loja.Loja;
import br.com.veiculoslrv.veiculos.Veiculo;

public class Main {
	public static void main(String[] args) {
		Loja loja = new Loja("VeiculosLRV", "Rua do ouro 21, 23775-594, Rio de Janeiro, Brasil");

		int opcao;

		do {
			opcao = Menu.exibirPrincipal();
			switch (opcao) {
			case 1:
				// Adicionar Carro
				Veiculo carro = Menu.adicionarCarro();
				if (carro != null) {
					try {
						loja.AdicionarVeiculo(carro);
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
				}
				break;
			case 2:
				// Adicionar Moto
				Veiculo moto = Menu.adicionarMoto();
				if (moto != null) {
					try {
						loja.AdicionarVeiculo(moto);
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
				}
				break;
			case 3:
				// Buscar carro				
				Menu.buscarCarro(loja);
				break;
			case 4:
				// Buscar Moto
				Menu.buscarMoto(loja);
				break;
			case 5:
				// Buscar Veiculo por Chassi
				Menu.pesquisarVeiculoPorChassi(loja);
				break;
			case 6:
				Menu.listarEstoqueDeCarro(loja);
				break;
			case 7:
				Menu.listarEstoqueDeMoto(loja);
				break;
			default:
				break;
			}

		} while (opcao != 0);

	}
}
