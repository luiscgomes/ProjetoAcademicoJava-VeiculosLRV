package br.com.veiculoslrv.loja;

import java.util.ArrayList;
import java.util.List;

import br.com.veiculoslrv.util.ArquivoUtil;
import br.com.veiculoslrv.veiculo.atributos.Atributo;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class Loja {
	private String endereco;
	private String nome;
	private List<Veiculo> estoqueVeiculos = new ArrayList<Veiculo>();
	private static String NOME_ARQUIVO_ESTOQUE = "estoque.txt";

	public Loja(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public void AdicionarVeiculo(Veiculo veiculo) {
		Veiculo buscarChassi = buscarVeiculo(veiculo.getChassi());
		if(buscarChassi == null){
			estoqueVeiculos.add(veiculo);
		}else{
			throw new IllegalArgumentException("Já existe um veiculo com o chassi: "+buscarChassi.getChassi());
		}
		
	}

	public Veiculo pesquisarVeiculo(Veiculo veiculoPesq) {
		for (Veiculo veiculo : estoqueVeiculos) {
			if (veiculo.getEspecificacao().equals(veiculoPesq.getEspecificacao())) {
				return veiculo;
			}
		}

		return null;
	}

	public Veiculo buscarVeiculo(String chassi) {
		for (Veiculo veiculo : estoqueVeiculos) {
			if ((veiculo.getChassi().equals(chassi))) {
				return veiculo;
			}
		}
		return null;
	}

	public void listarEstoquedeCarros() {
		System.out.println("**** Listar estoque de Carros *****");
		listarEstoque(TipoVeiculo.carro);
	}

	public void listarEstoquedeMotocicletas() {
		System.out.println("**** Listar estoque de Motos *****");
		listarEstoque(TipoVeiculo.motocicleta);
	}

	private void listarEstoque(TipoVeiculo tipoVeiculo) {
		if (estoqueVeiculos.isEmpty()) {
			System.out.println("****Estoque Vazio****\n");
		} else {
			int qtd=0;
			for (Veiculo veiculo : estoqueVeiculos) {
				if (veiculo.getTipoVeiculo() == tipoVeiculo) {
					informacoesVeiculo(veiculo);
					qtd++;
				}
			}
			if(qtd==0){
				if(tipoVeiculo==TipoVeiculo.carro){
					System.out.println("****Estoque de Carro Vazio****\n");
				}else{
					System.out.println("****Estoque de Moto Vazio****\n");
				}
			}
		}
		System.out.println("*********************************");
	}
	
	public void informacoesVeiculo(Veiculo veiculo){
		System.out.println("*********************************\n");
		System.out.println("Chassi: " + veiculo.getChassi());
		System.out.println("Montadora: " + veiculo.getMontadora());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Tipo: " + veiculo.getTipo());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("Preco: " + veiculo.getPreco());
		for (Atributo atributo : veiculo.getEspecificacao().keySet()) {
			System.out.println(atributo + ": " + veiculo.getEspecificacao().get(atributo));
		}
		System.out.println("\n*********************************");
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void salvarEstoque() {
		ArquivoUtil.salvaDados(NOME_ARQUIVO_ESTOQUE, estoqueVeiculos);
	}

	public void recuperarEstoque() {
		estoqueVeiculos = ArquivoUtil.recuperaDados(NOME_ARQUIVO_ESTOQUE);
	}

}
