package com.produtos.apirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.apirest.dto.ProdutoDTO;
import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produtoRepository;

	public ProdutoDTO findAll() {
		
		ProdutoDTO produtoDTO = new ProdutoDTO();
		
		List<Produto> prod =  produtoRepository.findAll();
		List endereco = new ArrayList();
	    endereco.add("Rua tres, 1888");
	    endereco.add("Rua dois, 218");
	    endereco.add("Rua um, 69");
		
	    List especialidade = new ArrayList();
	    especialidade.add("Java");
	    especialidade.add("hibernate");
	    especialidade.add("Spring MVC");
	    
	    produtoDTO.setId(1);
		produtoDTO.setNome("Benja");
		produtoDTO.setEndereco(endereco);
		produtoDTO.setEspecialidade(especialidade);
		
		produtoDTO.setProdutos(prod);
		
		System.out.println(produtoDTO.toString());
		
		return produtoDTO;
	}
}
