package br.com.grupo2.CyrelaApi.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {
	private long id;
	private String cidade;
	private String bloco;
	private String unidade;
	private String condominio;
	private Integer andamento;
	private BigDecimal valor;
	private String localizacao;

	public Imovel() {
	}

	public Imovel(String cidade, String bloco, String unidade, String condominio, Integer andamento,
			BigDecimal valor, String localizacao) {
		this.cidade = cidade;
		this.bloco = bloco;
		this.unidade = unidade;
		this.condominio = condominio;
		this.andamento = andamento;
		this.valor = valor;
		this.localizacao = localizacao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBloco() {
		return this.bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getCondominio() {
		return this.condominio;
	}

	public void setCondominio(String condominio) {
		this.condominio = condominio;
	}

	public Integer getAndamento() {
		return this.andamento;
	}

	public void setAndamento(Integer andamento) {
		this.andamento = andamento;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}
