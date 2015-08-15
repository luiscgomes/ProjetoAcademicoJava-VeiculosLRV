package br.com.veiculoslrv.loja;

import java.util.Scanner;

public final class Menu {
	public static void exibir() {
		Scanner ler = new Scanner(System.in);
		int opcao;

		do {
			System.out.printf("**** Menu Principal *****\n");
			System.out.printf("[ 1 ] Adicionar Carro\n");
			System.out.printf("[ 2 ] Adicionar Moto\n");
			System.out.printf("[ 3 ] Pesquisar Carro\n");
			System.out.printf("[ 4 ] Pesquisar Moto\n");
			System.out.printf("[ 5 ] Buscar Veiculo por Chassi\n");
			System.out.printf("[ 6 ] Listar Estoque de Carros\n");
			System.out.printf("[ 7 ] Listar Estoque de Motos\n");
			System.out.printf("[ 0 ] Encerrar o Programa\n");
			System.out.printf("\nOpção Desejada: ");

			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				break;

			default:
				System.out.println("Opção invalida");

			}
			System.out.printf("\n\n");
		} while (opcao != 0);

	}
}
