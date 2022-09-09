package com.dev.api.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dev.api.model.Produto;
import com.dev.api.model.ProdutoImagens;
import com.dev.api.repository.ProdutoImagensRepository;
import com.dev.api.repository.ProdutoRepository;

@Service
public class ProdutoImagensService {
	
	private static String caminhoImagens = "/home/aurelio/Documents/imagensProjectSpring";

	@Autowired
	private ProdutoImagensRepository produtoImagem;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<ProdutoImagens> buscarTodos(){
		return produtoImagem.findAll();
	}
	
	public ProdutoImagens salvar(Long idProduto,MultipartFile arquivo) {
		//pegar o id de produto
		Produto produto = produtoRepository.findById(idProduto).get();
		ProdutoImagens objecto = new ProdutoImagens();
		

		try {
			if (!arquivo.isEmpty()) {
				byte[] bytes = arquivo.getBytes();
				String nomeImagem = String.valueOf(produto.getId()) + arquivo.getOriginalFilename();
				Path caminho = Paths
						.get(caminhoImagens + String.valueOf(produto.getId()) + arquivo.getOriginalFilename());
				Files.write(caminho, bytes);
				objecto.setNome(nomeImagem);
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		objecto.setProduto(produto);
		objecto = produtoImagem.saveAndFlush(objecto);
		
		return objecto; 			
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
