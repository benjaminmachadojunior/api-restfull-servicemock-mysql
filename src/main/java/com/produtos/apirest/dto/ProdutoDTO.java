package com.produtos.apirest.dto;

import java.util.ArrayList;
import java.util.List;

import com.produtos.apirest.models.Produto;

public class ProdutoDTO {

	private int id;
	private String nome;
	private List<String> endereco;
	private List<Object> especialidade;
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


	

	public List<String> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<String> endereco) {
		this.endereco = endereco;
	}
	public List<Object> getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(ArrayList<Object> especialidade2) {
		this.especialidade = especialidade2;
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
