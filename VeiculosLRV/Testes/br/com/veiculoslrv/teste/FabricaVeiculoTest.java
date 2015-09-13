package br.com.veiculoslrv.teste;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import br.com.veiculoslrv.fabrica.FabricaVeiculo;
import br.com.veiculoslrv.veiculo.atributos.Atributo;
import br.com.veiculoslrv.veiculo.atributos.CarroAtributo;
import br.com.veiculoslrv.veiculo.atributos.MotoAtributo;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class FabricaVeiculoTest {

	@Test
	public void deveUltilizarAFabricaParaCriarUmCarro() {
		FabricaVeiculo fabrica = new FabricaVeiculo();

		Veiculo carro = fabrica.criarVeiculo(TipoVeiculo.carro);

		HashMap<Atributo, String> especificacoes = new HashMap<Atributo, String>();
		especificacoes.put(CarroAtributo.Motorizacao, "4x4");
		especificacoes.put(CarroAtributo.Cambio, "Automatico");
		carro.setEspecificacoes(especificacoes);

		carro.setModelo("HBS");
		carro.setChassi("12323sd");
		carro.setCor("Azul");
		carro.setMontadora("hyundai");
		carro.setPreco(60000);
		carro.setTipo("Sedan");

		HashMap<Atributo, String> especificacoesCarro = new HashMap<Atributo, String>();
		especificacoesCarro = (HashMap<Atributo, String>) carro.getEspecificacoes();

		assertEquals("4x4", especificacoesCarro.get(CarroAtributo.Motorizacao));
		assertEquals("Automatico", especificacoesCarro.get(CarroAtributo.Cambio));
		assertEquals("HBS", carro.getModelo());
		assertEquals("12323sd", carro.getChassi());
		assertEquals("Azul", carro.getCor());
		assertEquals("hyundai", carro.getMontadora());
		assertEquals(60000, carro.getPreco(), 000.1);
		assertEquals("Sedan", carro.getTipo());

	}

	@Test
	public void deveUltilizarAFabricaParaCriarUmaMoto() {
		FabricaVeiculo fabrica = new FabricaVeiculo();

		Veiculo moto = fabrica.criarVeiculo(TipoVeiculo.motocicleta);

		// moto.setAtributo(MotoAtributo.CapacidadeTanque, "50");
		// moto.setAtributo(MotoAtributo.Cilindrada, "500");
		
		HashMap<Atributo, String> especificacoes = new HashMap<Atributo, String>();
		especificacoes.put(MotoAtributo.CapacidadeTanque, "50");
		especificacoes.put(MotoAtributo.Cilindrada, "800");
		moto.setEspecificacoes(especificacoes);
		
		HashMap<Atributo, String> especificacoesMoto = new HashMap<Atributo, String>();
		especificacoesMoto = (HashMap<Atributo, String>) moto.getEspecificacoes();

		assertEquals("50", especificacoesMoto.get(MotoAtributo.CapacidadeTanque));
		assertEquals("800", especificacoesMoto.get(MotoAtributo.Cilindrada));
		
		// assertEquals("500", moto.getAtributo(MotoAtributo.Cilindrada));
		// assertEquals("50", moto.getAtributo(MotoAtributo.CapacidadeTanque));

	}
}
