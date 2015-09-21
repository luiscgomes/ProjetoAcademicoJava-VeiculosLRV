package br.com.veiculoslrv.veiculos;

import java.io.Serializable;
import java.util.Map;

import br.com.veiculoslrv.veiculo.atributos.Atributo;

public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String chassi;
	private String montadora;
	private String modelo;
	private String tipo; // Sedan, hatch...
	private String cor;
	private double preco;
	private Especificacao especificacao;

	public Veiculo(Especificacao especificacao) {		
		this.especificacao = especificacao;
	}

	public Especificacao getEspecificacao() {
		return this.especificacao;
	}

	public void setEspecificacao(Map<Atributo, String> especificacoes) {
		this.especificacao.setEspecificacoes(especificacoes); 
	}

	public TipoVeiculo getTipoVeiculo() {
		return this.especificacao.getTipoVeiculo();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		return true;
	}
}
