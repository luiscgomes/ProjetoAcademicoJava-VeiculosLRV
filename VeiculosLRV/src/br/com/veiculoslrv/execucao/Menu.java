package br.com.veiculoslrv.execucao;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import br.com.veiculoslrv.fabrica.FabricaVeiculo;
import br.com.veiculoslrv.loja.Loja;
import br.com.veiculoslrv.veiculo.atributos.Atributo;
import br.com.veiculoslrv.veiculo.atributos.CarroAtributo;
import br.com.veiculoslrv.veiculo.atributos.MotoAtributo;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
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
		} finally {
			ler.close();
		}

	}

	private static int erroMenu(String msn) {
		System.out.println("\n**** Erro ****");
		System.out.println(msn);
		System.out.println("**************\n");
		return -1;
	}

	public static Veiculo adicionarCarro() {
		Veiculo carro = FabricaVeiculo.criarVeiculo(TipoVeiculo.carro);
		Map<Atributo, String> especificacoes = new HashMap<Atributo, String>();
		try {
			System.out.println("**** Adicionar Carro *****\n");

			carro = recuperaDadosCarro(carro, especificacoes);

			return carro;
		} catch (InputMismatchException e) {
			erroMenu("Informe o valor correto");
			return null;
		}

	}

	public static Veiculo adicionarMoto() {
		Veiculo moto = FabricaVeiculo.criarVeiculo(TipoVeiculo.motocicleta);
		Map<Atributo, String> especificacoes = new HashMap<Atributo, String>();

		try {
			System.out.println("**** Adicionar Moto *****");

			moto = recuperaDadosMoto(moto, especificacoes);

			return moto;
		} catch (InputMismatchException e) {
			erroMenu("Informe o valor correto");
			return null;
		}

	}

	public static Veiculo pesquisaCarro(Loja loja) {
		Veiculo carro = FabricaVeiculo.criarVeiculo(TipoVeiculo.carro);
		Map<Atributo, String> especificacoes = new HashMap<Atributo, String>();

		carro = recuperaDadosCarro(carro, especificacoes);

		return loja.pesquisarVeiculo(carro);
	}

	public static Veiculo pesquisaMoto(Loja loja) {
		Veiculo moto = FabricaVeiculo.criarVeiculo(TipoVeiculo.motocicleta);
		Map<Atributo, String> especificacoes = new HashMap<Atributo, String>();

		moto = recuperaDadosCarro(moto, especificacoes);

		return loja.pesquisarVeiculo(moto);
	}

	public static void listarEstoqueDeCarro(Loja loja) {
		loja.listarEstoquedeCarros();
	}

	public static void listarEstoqueDeMoto(Loja loja) {
		loja.listarEstoquedeMotocicletas();
	}

	private static Veiculo recuperaDados(Veiculo veiculo) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informa o Chassi: ");
		veiculo.setChassi(ler.nextLine());

		System.out.println("Informa a Montadora: ");
		veiculo.setMontadora(ler.nextLine());

		System.out.println("Informa o Modelo: ");
		veiculo.setModelo(ler.nextLine());

		System.out.println("Informa o Tipo: ");
		veiculo.setTipo(ler.nextLine());

		System.out.println("Informa a Cor: ");
		veiculo.setCor(ler.nextLine());

		System.out.println("Informa o Preco: ");
		veiculo.setPreco(ler.nextFloat());

		//ler.close();

		return veiculo;
	}

	private static Veiculo recuperaDadosCarro(Veiculo carro, Map<Atributo, String> especificacoes) {

		carro = recuperaDados(carro);
		Scanner ler = new Scanner(System.in);

		System.out.println("Informa o Cambio: ");
		especificacoes.put(CarroAtributo.Cambio, String.valueOf(ler.nextLine()));

		System.out.println("Informa a Motorizacao: ");
		especificacoes.put(CarroAtributo.Motorizacao, ler.nextLine());

		carro.setEspecificacao(especificacoes);

		ler.close();

		return carro;
	}

	private static Veiculo recuperaDadosMoto(Veiculo moto, Map<Atributo, String> especificacoes) {

		moto = recuperaDados(moto);
		Scanner ler = new Scanner(System.in);

		System.out.println("Informa a Cilindrada: ");
		especificacoes.put(MotoAtributo.Cilindrada, String.valueOf(ler.nextLine()));

		System.out.println("Informa a Capacidade do Tanque: ");
		especificacoes.put(MotoAtributo.CapacidadeTanque, String.valueOf(ler.nextLine()));

		moto.setEspecificacao(especificacoes);

		ler.close();
		return moto;
	}

	public static void pesquisarVeiculoPorChassi(Loja loja) {
		Scanner ler = new Scanner(System.in);
		String chassi;
		System.out.println("Informe o chassi");
		chassi = ler.nextLine();
		ler.close();
		Veiculo veiculo = loja.buscarVeiculo(chassi);
		if (veiculo == null) {
			System.out.println("Veiculo não encontrado");
		} else {
			loja.informacoesVeiculo(veiculo);
		}

	}
}
