package com.dev.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dev.api.model.ProdutoImagens;
import com.dev.api.service.ProdutoImagensService;

@RestController
@RequestMapping("/produtoImagens")
public class ProdutoImagensController {

	@Autowired
	private ProdutoImagensService produtoImagensService;
	
	@GetMapping("/")
	public List<ProdutoImagens> listar(){
		return produtoImagensService.buscarTodos();
	}
	
	@PostMapping("/")
	public ProdutoImagens salvar(@RequestParam("idProduto") Long idProduto, MultipartFile file) {
		return produtoImagensService.salvar(idProduto, file);
	}
}
