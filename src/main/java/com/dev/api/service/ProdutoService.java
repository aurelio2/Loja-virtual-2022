package com.dev.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.Produto;
import com.dev.api.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public List<Produto> listar(){
		
		return produtoRepository.findAll();
	}
	
	public Produto salvar(Produto pro) {
		pro.setDataCriacao(new Date());
		
		Produto novoPro = produtoRepository.saveAndFlush(pro);
		
		return novoPro;
	}
	
	public Produto actualizar(Produto pro) {
		
		return produtoRepository.saveAndFlush(pro);
	}
	
	public void excluir (Long id) {
		//pegar o id
		Produto produtoID = produtoRepository.findById(id).get();
		
		produtoRepository.delete(produtoID);
	}
}
