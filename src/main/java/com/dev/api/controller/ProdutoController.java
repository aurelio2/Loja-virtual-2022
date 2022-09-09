package com.dev.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dev.api.model.Produto;
import com.dev.api.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	
	@GetMapping("/")
	public List<Produto> buscarTodos(){
		
		return produtoService.listar();
	}
	
	@PostMapping("/")
	public Produto salvar(@RequestBody Produto pro) {
		return produtoService.salvar(pro);
	}
	
	@PutMapping("/")
	public Produto actualizar(@RequestBody Produto pro) {
		
		return produtoService.salvar(pro);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		
		produtoService.excluir(id);
		
		return ResponseEntity.ok().build();
	}
}
