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

	public Carro buscarCarro(String chassi) {
		for (Carro carro : estoqueCarros) {
			if (carro.chassi.equals(chassi)) {
				System.out.println("Achou!!");
				return carro;
			}

		}
		Carro carro = new Carro();
		return carro;
	}

	public Motocicleta buscarMoto(String chassi) {
		for (Motocicleta moto : estoqueMotocicletas) {
			if (moto.chassi.equals(chassi)) {
				System.out.println("Achou!!");
				return moto;
			}

		}
		Motocicleta moto = new Motocicleta();
		return moto;

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

	public void pesquisarVeiculo(Carro carro) {

	}

	public void pesquisarVeiculo(Motocicleta moto) {

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
