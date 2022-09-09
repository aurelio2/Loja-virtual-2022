package com.dev.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.ProdutoImagens;
import com.dev.api.repository.ProdutoImagensRepository;

@Service
public class ProdutoImagensService {

	@Autowired
	private ProdutoImagensRepository produtoImagem;
	
	public List<ProdutoImagens> buscarTodos(){
		return produtoImagem.findAll();
	}
	
	public ProdutoImagens salvar(ProdutoImagens objecto) {
		ProdutoImagens objectoNovo = produtoImagem.saveAndFlush(objecto);
		
		return objectoNovo; 			
	}
	
	public ProdutoImagens alterar(ProdutoImagens objecto) {
		
		return produtoImagem.saveAndFlush(objecto);		
	}
	
	public void excluir(Long id) {
		
		//pegar o id
		ProdutoImagens produtoImagemId = produtoImagem.findById(id).get();
		
		produtoImagem.delete(produtoImagemId);
	}
}
