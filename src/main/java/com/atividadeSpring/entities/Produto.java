package com.atividadeSpring.entities;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {

	@ManyToOne
	private Carrinho carrinho;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;

	private String nome;

	private BigDecimal valor;

	private int quantidade;

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [carrinho=" + carrinho + ", id=" + id + ", nome=" + nome + ", valor=" + valor + ", quantidade="
				+ quantidade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(carrinho, id, nome, quantidade, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(carrinho, other.carrinho) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && quantidade == other.quantidade
				&& Objects.equals(valor, other.valor);
	}

	public Produto(Carrinho carrinho, Integer id, String nome, BigDecimal valor, int quantidade) {
		super();
		this.carrinho = carrinho;
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto() {
		super();

	}

	public Produto(Produto produto) {
		
	}

}
