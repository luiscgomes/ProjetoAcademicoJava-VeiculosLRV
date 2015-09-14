package br.com.veiculoslrv.loja;

import java.util.ArrayList;
import java.util.List;

import br.com.veiculoslrv.execucao.Motocicleta;
import br.com.veiculoslrv.util.ArquivoUtil;
import br.com.veiculoslrv.veiculo.atributos.Atributo;
import br.com.veiculoslrv.veiculos.Especificacao;
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
		estoqueVeiculos.add(veiculo);
	}	
	
	public Veiculo pesquisarVeiculo(Especificacao especificacao) {
		for (Veiculo veiculo : estoqueVeiculos) {
			if (veiculo.getEspecificacao().equals(especificacao)) {
				return veiculo;
			}
		}
		
		return null;
	}
	
	public Veiculo buscarCarro(String chassi) {
		return buscarVeiculo(chassi, TipoVeiculo.carro);
	}
	
	public Veiculo buscarMoto(String chassi) {
		return buscarVeiculo(chassi, TipoVeiculo.motocicleta);
	}
	
	private Veiculo buscarVeiculo(String chassi, TipoVeiculo tipoVeiculo) {
		for (Veiculo veiculo : estoqueVeiculos) {
			if ((veiculo.getChassi() == chassi) && (veiculo.getEspecificacao().getTipoVeiculo() == tipoVeiculo)) {
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
			for (Veiculo veiculo : estoqueVeiculos) {
				if (veiculo.getEspecificacao().getTipoVeiculo() == tipoVeiculo) {				
					System.out.println("*********************************\n");
					System.out.println("Chassi: " + veiculo.getChassi());
					System.out.println("Montadora: " + veiculo.getMontadora());
					System.out.println("Modelo: " + veiculo.getModelo());
					System.out.println("Tipo: " + veiculo.getTipo());
					System.out.println("Cor: " + veiculo.getCor());
					System.out.println("Preco: " + veiculo.getPreco());
					for (Atributo atributo : veiculo.getEspecificacao().getEspecificacoes().keySet()) {
						System.out.println(atributo + ": " + veiculo.getEspecificacao().getEspecificacoes().get(atributo));
					}
					System.out.println("\n*********************************");								
				}			
			}
		}
		System.out.println("*********************************");	
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
