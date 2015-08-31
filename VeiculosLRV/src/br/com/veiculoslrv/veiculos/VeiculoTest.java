package br.com.veiculoslrv.veiculos;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VeiculoTest {

	@Test
	public void deveCriarUmCarro() {
		Veiculo veiculo = new Veiculo();
		
		Map<String, String> atributo = new HashMap<String, String>();
		atributo.put("Cambio", "automático");
		atributo.put("Motorizacao", "4x4");
		
		Especificacao especificacao = new Especificacao();		
		especificacao.setTipoVeiculo(TipoVeiculo.carro);
		especificacao.setEspecificacoes(atributo);
		
		veiculo.setEspecificacao(especificacao);
		veiculo.setModelo("HBS");
		veiculo.setChassi("12323sd");

		especificacao = veiculo.getEspecificacao();
		
		if (especificacao.getTipoVeiculo() == TipoVeiculo.carro) {
			System.out.println("Carro");			
			atributo = especificacao.getEspecificacoes();
			if (atributo.containsKey("Cambio")) {
				System.out.println(atributo.get("Cambio"));
			}
			if(atributo.containsKey("Motorizacao")){
				System.out.println(atributo.get("Motorizacao"));
			}
		}

	}

}
