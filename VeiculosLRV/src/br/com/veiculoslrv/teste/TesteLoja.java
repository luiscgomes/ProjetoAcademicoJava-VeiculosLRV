package br.com.veiculoslrv.teste;

import br.com.veiculoslrv.loja.Loja;
import br.com.veiculoslrv.veiculos.Carro;
import br.com.veiculoslrv.veiculos.Motocicleta;

public class TesteLoja {

	public static void main(String[] args) {
		Loja loja = new Loja();
		loja.setNome("VeiculosLRV");
		loja.setEndereco("Rua Centro 1263, 21775-846, Rio de janeiro");
		
		Carro carro = new Carro();
		carro.setModelo("HB20");
		carro.setChassi("abc123");
		
		Motocicleta moto = new Motocicleta();
		moto.setModelo("BIZ 120");
		
		loja.AdicionarVeiculo(carro);
		loja.AdicionarVeiculo(moto);
		
		loja.listarEstoquedeCarros();
		loja.listarEstoquedeMotos();
		loja.buscarCarro("abcs123");

	}

}
