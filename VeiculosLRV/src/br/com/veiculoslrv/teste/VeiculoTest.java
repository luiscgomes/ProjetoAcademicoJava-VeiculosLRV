package br.com.veiculoslrv.teste;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import br.com.veiculoslrv.veiculos.Especificacao;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class VeiculoTest {

	@Test
	public void deveCriarUmCarro() {
		Veiculo carro = new Veiculo();

		Map<String, String> atributo = new HashMap<String, String>();
		atributo.put("Cambio", "Automatico");
		atributo.put("Motorizacao", "4x4");

		Especificacao especificacao = new Especificacao();
		especificacao.setTipoVeiculo(TipoVeiculo.carro);
		especificacao.setEspecificacoes(atributo);

		//Cria um veiculo
		carro.setEspecificacao(especificacao);
		carro.setModelo("HBS");
		carro.setChassi("12323sd");
		carro.setCor("Azul");
		carro.setMontadora("hyundai");
		carro.setPreco(60000);
		carro.setTipo("Sedan");
		
		especificacao = carro.getEspecificacao();

		// Tipo do veiculo deve ser carro
		assertTrue(especificacao.getTipoVeiculo() == TipoVeiculo.carro);
		assertTrue(atributo.containsKey("Cambio"));
		assertTrue(atributo.containsKey("Motorizacao"));

		assertEquals("Automatico", atributo.get("Cambio"));
		assertEquals("HBS", carro.getModelo());
		assertEquals("12323sd", carro.getChassi());
		assertEquals("Azul", carro.getCor());
		assertEquals("hyundai", carro.getMontadora());
		assertEquals(60000, carro.getPreco(),000.1);		
		assertEquals("Sedan", carro.getTipo());		

	}

}
