package br.com.veiculoslrv.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.veiculoslrv.fabrica.FabricaVeiculo;
import br.com.veiculoslrv.loja.Loja;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class LojaTest {

	private Loja loja;
	private Veiculo carro;
	private Veiculo moto;

	@Before
	public void criaLoja() {
		this.loja = new Loja("VeiculosLRV", "Rua Centro 1263, 21775-846, Rio de janeiro");
		this.carro = FabricaVeiculo.criarVeiculo(TipoVeiculo.carro);
		this.carro.setChassi("abc123");
		this.moto = FabricaVeiculo.criarVeiculo(TipoVeiculo.motocicleta);
		this.moto.setChassi("MT120");

	}

	@Test
	public void pesquisarVeiculoPorChassi() {
		this.loja.AdicionarVeiculo(this.carro);
		this.loja.AdicionarVeiculo(this.moto);
		assertEquals(this.carro, this.loja.buscarVeiculo("abc123"));
		assertEquals(this.moto, this.loja.buscarVeiculo("MT120"));

	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarPrecoNegativo() {
		this.carro.setPreco(-100);
		this.loja.AdicionarVeiculo(carro);

	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarDoisVeiculosComOMesmoChassi() {
		this.moto.setChassi("abc123");
		this.carro.setChassi("abc123");
		this.loja.AdicionarVeiculo(this.moto);
		this.loja.AdicionarVeiculo(this.carro);

	}

}
