package br.com.veiculoslrv.loja;

import java.util.ArrayList;

import br.com.veiculoslrv.veiculos.Especificacao;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class Loja {
	private String endereco;
	private String nome;
	private ArrayList<Veiculo> estoqueVeiculos = new ArrayList<Veiculo>();
	
	
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
	
	public void listarEstoquedeCarros() {
		listarEstoque(TipoVeiculo.carro);
	}
	
	public void listarEstoquedeMotocicletas() {
		listarEstoque(TipoVeiculo.motocicleta);
	}
	
	private void listarEstoque(TipoVeiculo tipoVeiculo) {
		for (Veiculo veiculo : estoqueVeiculos) {
			if (veiculo.getEspecificacao().getTipoVeiculo() == tipoVeiculo) {
				System.out.println(veiculo.toString());
			}			
		}
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

}
