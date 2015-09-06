package br.com.veiculoslrv.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.veiculoslrv.fabrica.FabricaVeiculo;
import br.com.veiculoslrv.veiculo.atributos.CarroAtributo;
import br.com.veiculoslrv.veiculo.atributos.MotoAtributo;
import br.com.veiculoslrv.veiculos.TipoVeiculo;
import br.com.veiculoslrv.veiculos.Veiculo;

public class FabricaVeiculoTest {

	@Test
	public void deveUltilizarAFabricaParaCriarUmCarro() {
		FabricaVeiculo fabrica = new FabricaVeiculo();

		Veiculo carro = fabrica.criarVeiculo(TipoVeiculo.carro);

		carro.setAtributo(CarroAtributo.Motorizacao, "4x4");
		carro.setAtributo(CarroAtributo.Cambio, "Automatico");
		carro.setModelo("HBS");
		carro.setChassi("12323sd");
		carro.setCor("Azul");
		carro.setMontadora("hyundai");
		carro.setPreco(60000);
		carro.setTipo("Sedan");

		assertEquals("4x4", carro.getAtributo(CarroAtributo.Motorizacao));
		assertEquals("Automatico", carro.getAtributo(CarroAtributo.Cambio));
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

		moto.setAtributo(MotoAtributo.CapacidadeTanque, "50");
		moto.setAtributo(MotoAtributo.Cilindrada, "500");

		assertEquals("500", moto.getAtributo(MotoAtributo.Cilindrada));
		assertEquals("50", moto.getAtributo(MotoAtributo.CapacidadeTanque));

	}
}
