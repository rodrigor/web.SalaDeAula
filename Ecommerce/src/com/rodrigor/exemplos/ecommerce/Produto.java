package com.rodrigor.exemplos.ecommerce;

public class Produto {
	
	private String id;
	private String nome;
	private Double preco;

	public Produto(String id, String nome, double preco) {
		this.setId(id);
		this.setNome(nome);
		this.setPreco(preco);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
