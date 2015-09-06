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
		Veiculo veiculo = new Veiculo();

		Map<String, String> atributo = new HashMap<String, String>();
		atributo.put("Cambio", "Automatico");
		atributo.put("Motorizacao", "4x4");

		Especificacao especificacao = new Especificacao();
		especificacao.setTipoVeiculo(TipoVeiculo.carro);
		especificacao.setEspecificacoes(atributo);

		//Cria um veiculo
		veiculo.setEspecificacao(especificacao);
		veiculo.setModelo("HBS");
		veiculo.setChassi("12323sd");
		veiculo.setCor("Azul");
		veiculo.setMontadora("hyundai");
		veiculo.setPreco(60000);
		veiculo.setTipo("Sedan");
		
		especificacao = veiculo.getEspecificacao();

		// Tipo do veiculo deve ser carro
		assertTrue(especificacao.getTipoVeiculo() == TipoVeiculo.carro);
		assertTrue(atributo.containsKey("Cambio"));
		assertTrue(atributo.containsKey("Motorizacao"));

		assertEquals("Automatico", atributo.get("Cambio"));
		assertEquals("HBS", veiculo.getModelo());
		assertEquals("12323sd", veiculo.getChassi());
		assertEquals("Azul", veiculo.getCor());
		assertEquals("hyundai", veiculo.getMontadora());
		assertEquals(60000, veiculo.getPreco(),000.1);		
		assertEquals("Sedan", veiculo.getTipo());		

	}

}
