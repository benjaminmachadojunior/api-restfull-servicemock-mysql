package com.produtos.apirest.dto;

import java.util.List;

import com.produtos.apirest.models.Produto;

public class ProdutoDTO {

	private int id;
	private String nome;
	private List<Endereco> endereco;
	private List<Endereco> especialidade;
	private List<Produto> produtos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	public List<Endereco> getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(List<Endereco> especialidade) {
		this.especialidade = especialidade;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	@Override
	public String toString() {
		return "ProdutoDTO [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", especialidade=" + especialidade
				+ ", produtos=" + produtos + "]";
	}


}
