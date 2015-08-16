package br.com.veiculoslrv.loja;

import java.util.Scanner;

import br.com.veiculoslrv.veiculos.Carro;
import br.com.veiculoslrv.veiculos.Motocicleta;
import br.com.veiculoslrv.veiculos.Veiculo;

public final class Menu {
	public static int exibirPrincipal() {
		Scanner ler = new Scanner(System.in);

		System.out.println("**** Menu Principal *****");
		System.out.println("[ 1 ] Adicionar Carro");
		System.out.println("[ 2 ] Adicionar Moto");
		System.out.println("[ 3 ] Pesquisar Carro");
		System.out.println("[ 4 ] Pesquisar Moto");
		System.out.println("[ 5 ] Buscar Veiculo por Chassi");
		System.out.println("[ 6 ] Listar Estoque de Carros");
		System.out.println("[ 7 ] Listar Estoque de Motos");
		System.out.println("[ 0 ] Encerrar o Programa");
		System.out.println("\nOpção Desejada: ");
		return ler.nextInt();

	}

	public static Carro adicionarCarro() {
		Carro carro = new Carro();
		Scanner ler = new Scanner(System.in);

		System.out.println("**** Adicionar Carro *****");
		System.out.println("Informa o Chassi: ");
		carro.chassi = ler.nextLine();

		System.out.println("Informa a Montadora: ");
		carro.montadora = ler.nextLine();

		System.out.println("Informa o Modelo: ");
		carro.modelo = ler.nextLine();

		System.out.println("Informa o Tipo: ");
		carro.tipo = ler.nextLine();

		System.out.println("Informa a Por: ");
		carro.cor = ler.nextLine();

		System.out.println("Informa o Preco: ");
		carro.preco = ler.nextFloat();

		System.out.println("Informa a Motorizacao: ");
		carro.preco = ler.nextFloat();

		System.out.println("Informa o Cambio: ");
		carro.cor = ler.nextLine();
		return carro;

	}

	public static Motocicleta adicionarMoto() {
		Motocicleta moto = new Motocicleta();

		Scanner ler = new Scanner(System.in);

		System.out.println("**** Adicionar Carro *****");
		System.out.println("Informa o Chassi: ");
		moto.chassi = ler.nextLine();

		System.out.println("Informa a Montadora: ");
		moto.montadora = ler.nextLine();

		System.out.println("Informa o Modelo: ");
		moto.modelo = ler.nextLine();

		System.out.println("Informa o Tipo: ");
		moto.tipo = ler.nextLine();

		System.out.println("Informa a Por: ");
		moto.cor = ler.nextLine();

		System.out.println("Informa o Preco: ");
		moto.preco = ler.nextFloat();

		System.out.println("Informa a Cilindrada: ");
		moto.setCilindrada(ler.nextInt());

		System.out.println("Informa a Capacidade do Tanque: ");
		moto.setCapTanque(ler.nextInt());

		return moto;
	}

}
