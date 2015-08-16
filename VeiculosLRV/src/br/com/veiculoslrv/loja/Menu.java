package br.com.veiculoslrv.loja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.veiculoslrv.veiculos.Carro;
import br.com.veiculoslrv.veiculos.Motocicleta;
import br.com.veiculoslrv.veiculos.Veiculo;

public final class Menu {
	public static int exibirPrincipal() {
		Scanner ler = new Scanner(System.in);
		int opcao;

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

		try {
			opcao = ler.nextInt();
			if (opcao < 0 || opcao > 7) {
				throw new IllegalArgumentException("Somente numero possitivo menor que 8");
			}
			return opcao;
		} catch (InputMismatchException e) {
			return erroMenu("Digite somente numero");
		} catch (IllegalArgumentException e) {
			return erroMenu(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return erroMenu("Erro desconhecido");
		}

	}

	private static int erroMenu(String msn) {
		System.out.println("\n**** Erro ****");
		System.out.println(msn);
		System.out.println("**************\n");
		return -1;
	}

	public static Carro adicionarCarro() {
		Carro carro = new Carro();
		Scanner ler = new Scanner(System.in);
		try {
			System.out.println("**** Adicionar Carro *****\n");
			System.out.println("Informa o Chassi: ");
			carro.setChassi(ler.nextLine());

			System.out.println("Informa a Montadora: ");
			carro.setMontadora(ler.nextLine());

			System.out.println("Informa o Modelo: ");
			carro.setModelo(ler.nextLine());

			System.out.println("Informa o Tipo: ");
			carro.setTipo(ler.nextLine());

			System.out.println("Informa a Cor: ");
			carro.setCor(ler.nextLine());

			System.out.println("Informa o Cambio: ");
			carro.setCambio(ler.nextLine());

			System.out.println("Informa o Preco: ");
			carro.setPreco(ler.nextFloat());

			System.out.println("Informa a Motorizacao: ");
			carro.setMotorizacao(ler.nextFloat());
			return carro;
		} catch (InputMismatchException e) {
			erroMenu("Somente numero");
			return null;
		}

	}

	public static Motocicleta adicionarMoto() {
		Motocicleta moto = new Motocicleta();

		Scanner ler = new Scanner(System.in);

		System.out.println("**** Adicionar Moto *****");
		System.out.println("Informa o Chassi: ");
		moto.setChassi(ler.nextLine());

		System.out.println("Informa a Montadora: ");
		moto.setMontadora(ler.nextLine());

		System.out.println("Informa o Modelo: ");
		moto.setModelo(ler.nextLine());

		System.out.println("Informa o Tipo: ");
		moto.setTipo(ler.nextLine());

		System.out.println("Informa a Por: ");
		moto.setCor(ler.nextLine());

		System.out.println("Informa o Preco: ");
		moto.setPreco(ler.nextFloat());

		System.out.println("Informa a Cilindrada: ");
		moto.setCilindrada(ler.nextInt());

		System.out.println("Informa a Capacidade do Tanque: ");
		moto.setCapTanque(ler.nextInt());

		return moto;
	}

	public static void listarEstoqueDeMoto(ArrayList<Motocicleta> estoqueMoto) {

		System.out.println("**** Listar estoque de Moto *****");
		System.out.println("*********************************\n");
		if (estoqueMoto.isEmpty()) {
			System.out.println("****Estoque Vazio****\n");
		} else {
			for (Motocicleta moto : estoqueMoto) {
				System.out.println("Chassi: " + moto.getChassi());
				System.out.println("Montadora: " + moto.getMontadora());
				System.out.println("Modelo: " + moto.getModelo());
				System.out.println("Tipo: " + moto.getTipo());
				System.out.println("Cor: " + moto.getCor());
				System.out.println("Preco: " + moto.getPreco());
				System.out.println("Cilindrada: " + moto.getCilindrada());
				System.out.println("Capacidade do Tanque: " + moto.getCapTanque());
				System.out.println("\n*********************************");
			}
		}
		System.out.println("*********************************");

	}

	public static void listarEstoqueDeCarro(ArrayList<Carro> estoqueCarros) {
		System.out.println("**** Listar estoque de Moto *****");
		System.out.println("*********************************\n");
		if (estoqueCarros.isEmpty()) {
			System.out.println("****Estoque Vazio****\n");
		} else {
			for (Carro carro : estoqueCarros) {
				System.out.println("Chassi: " + carro.getChassi());
				System.out.println("Montadora: " + carro.getMontadora());
				System.out.println("Modelo: " + carro.getModelo());
				System.out.println("Tipo: " + carro.getTipo());
				System.out.println("Cor: " + carro.getCor());
				System.out.println("Preco: " + carro.getPreco());
				System.out.println("Motorizacao: " + carro.getMotorizacao());
				System.out.println("Cambio: " + carro.getCambio());
				System.out.println("\n*********************************");

			}
		}
		System.out.println("\n*********************************");

	}

}
