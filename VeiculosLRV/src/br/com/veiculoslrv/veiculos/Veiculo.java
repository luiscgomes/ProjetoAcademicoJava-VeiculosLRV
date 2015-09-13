package br.com.veiculoslrv.veiculos;

import java.io.Serializable;

import br.com.veiculoslrv.veiculo.atributos.CarroAtributo;
import br.com.veiculoslrv.veiculo.atributos.MotoAtributo;

public class Veiculo implements Serializable {
	private String chassi;
	private String montadora;
	private String modelo;
	private String tipo; // Sedan, hatch...
	private String cor;
	private double preco;
	private Especificacao especificacao;

	public Especificacao getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(Especificacao especificacao) {
		this.especificacao = especificacao;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 1) {
			throw new IllegalArgumentException("Preço não pode ser menor que zero!");
		}

		this.preco = preco;
	}

	public void setAtributo(CarroAtributo nomeAtributo, String atributo) {
		especificacao.getEspecificacoes().put(nomeAtributo.name(), atributo);
	}

	public String getAtributo(CarroAtributo nomeAtributo) {
		if (!especificacao.getEspecificacoes().containsKey(nomeAtributo.name())) {
			throw new IllegalArgumentException("Atributo Invalido");
		}
		return especificacao.getEspecificacoes().get(nomeAtributo.name());

	}
	
	public void setAtributo(MotoAtributo nomeAtributo, String atributo) {
		especificacao.getEspecificacoes().put(nomeAtributo.name(), atributo);
	}

	public String getAtributo(MotoAtributo nomeAtributo) {
		if (!especificacao.getEspecificacoes().containsKey(nomeAtributo.name())) {
			throw new IllegalArgumentException("Atributo Invalido");
		}
		return especificacao.getEspecificacoes().get(nomeAtributo.name());

	}
	
	

	public TipoVeiculo getTipoVeiculo() {
		return especificacao.getTipoVeiculo();

	}

}
