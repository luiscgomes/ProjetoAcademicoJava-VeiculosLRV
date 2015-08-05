package br.com.veiculoslrv.loja;

import java.util.ArrayList;

import br.com.veiculoslrv.veiculos.Carro;
import br.com.veiculoslrv.veiculos.Motocicleta;

public class Loja {
	private String endereco;
	private String nome;
	private ArrayList<Carro> estoqueCarros = new ArrayList<Carro>();
	private ArrayList<Motocicleta> estoqueMotocicletas = new ArrayList<Motocicleta>();

	public void AdicionarVeiculo(Carro carro) {
		estoqueCarros.add(carro);
	}

	public void AdicionarVeiculo(Motocicleta moto) {
		estoqueMotocicletas.add(moto);
	}

	public void buscarVeiculo(Carro carro) {
		for (Carro veiculo : estoqueCarros) {
			if (carro.chassi.equals(veiculo.chassi)) {
				System.out.println("Achou!!");
			}

		}
	}

	public void buscarVeiculo(Motocicleta moto) {
		for (Motocicleta veiculo : estoqueMotocicletas) {
			if (moto.chassi.equals(veiculo.chassi)) {
				System.out.println("Achou!!");
			}

		}

	}

	public void listarEstoquedeMotos() {
		for (Motocicleta moto : estoqueMotocicletas) {
			System.out.println(moto.getModelo());
		}

	}

	public void listarEstoquedeCarros() {
		for (Carro carro : estoqueCarros) {
			System.out.println(carro.getModelo());
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
