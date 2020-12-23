package com.produtos.apirest;

import java.math.BigDecimal;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.mockito.Mockito;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

public class ProdutoResourceTest {

	ProdutoRepository produtoRepository;
	@Test
	public void listaProdutos() {
		
		BigDecimal big = new BigDecimal(0);
		
		Produto produto = Mockito.mock(Produto.class);
		produto.setId(1);
		produto.setNome("nome");
		produto.setQuantidade(big);
		produto.setValor(big);
		Mockito.doReturn(Arrays.asList(produto)).when(produtoRepository).findAll();
	}
}
