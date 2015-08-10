package br.com.veiculoslrv.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.veiculoslrv.loja.Loja;
import br.com.veiculoslrv.veiculos.Carro;
import br.com.veiculoslrv.veiculos.Motocicleta;

public class LojaTest {
	private Loja loja;

	@Before
	public void criaLoja() {
		this.loja = new Loja();
		loja.setNome("VeiculosLRV");
		loja.setEndereco("Rua Centro 1263, 21775-846, Rio de janeiro");
	}

	@Test
	public void pesquisarVeiculoPorChassi() {

		Carro carro = new Carro();
		carro.setModelo("HB20");
		carro.setChassi("abc123");

		Motocicleta moto = new Motocicleta();
		moto.setModelo("BIZ 120");
		moto.setChassi("MT120");

		loja.AdicionarVeiculo(carro);
		loja.AdicionarVeiculo(moto);

		assertEquals(carro, loja.buscarCarro("abc123"));
		assertEquals(moto, loja.buscarMoto("MT120"));

	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarPrecoNegativo() {

		Carro carro = new Carro();
		carro.setModelo("HB20");
		carro.setChassi("abc123");
		carro.setPreco(-100);

		loja.AdicionarVeiculo(carro);

	}

}
