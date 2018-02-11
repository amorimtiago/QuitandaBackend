package br.com.yaman.quitanda.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "PRODUTO")
@SequenceGenerator(name = "ProdutoSeq", sequenceName = "SEQ_COD_PRODUTO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProdutoSeq")
    @Column(name = "COD_PRODUTO")
    private Integer id;
	
    @Column(name = "NOME")
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_TIPO_PRODUTO", nullable = false)
    @JsonManagedReference
    private TipoProduto tipoProduto;
    
    @Column(name = "DESCRICAO")
    private String descricao;
    
    @Column(name = "CALORIAS")
    private Double calorias;
    
    @Column(name = "PESO_MEDIO")
    private Double pesoMedio;

    public Produto() {
    }
    
	public Produto(Integer id, String nome, TipoProduto tipoProduto, String descricao, Double calorias,
			Double pesoMedio) {
		this.id = id;
		this.nome = nome;
		this.tipoProduto = tipoProduto;
		this.descricao = descricao;
		this.calorias = calorias;
		this.pesoMedio = pesoMedio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}

	public Double getPesoMedio() {
		return pesoMedio;
	}

	public void setPesoMedio(Double pesoMedio) {
		this.pesoMedio = pesoMedio;
	}
	
}
