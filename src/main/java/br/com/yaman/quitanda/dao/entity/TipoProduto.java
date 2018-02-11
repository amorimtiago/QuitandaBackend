package br.com.yaman.quitanda.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;



@Entity
@Table(name = "TIPO_PRODUTO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoProduto implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "COD_TIPO_PRODUTO")
    private Integer id;
    
    @Column(name = "NOME")
    private String nome;
    
    @OneToMany(mappedBy="tipoProduto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonIgnore
    @JsonBackReference
    private List<Produto> produto;

    public TipoProduto() {
    }
    
	public TipoProduto(Integer id, String nome, List<Produto> produto) {
		this.id = id;
		this.nome = nome;
		this.produto = produto;
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

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}


}
