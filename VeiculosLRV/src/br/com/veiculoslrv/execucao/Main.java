package br.com.veiculoslrv.execucao;

import br.com.veiculoslrv.loja.Loja;
import br.com.veiculoslrv.loja.Menu;

public class Main {
	public static void main(String[] args) {
		Loja loja = new Loja("VeiculosLRV", "Rua do ouro 21, 23775-594, Rio de Janeiro, Brasil");
		
		int opcao;

		do {
			opcao = Menu.exibirPrincipal();
			switch (opcao) {
			case 1:
				loja.AdicionarVeiculo(Menu.adicionarCarro());
				break;
			case 2:
				loja.AdicionarVeiculo(Menu.adicionarMoto());

			default:
				break;
			}
			
		} while (opcao != 0);

	}
}
