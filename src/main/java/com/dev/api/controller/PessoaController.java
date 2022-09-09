package com.dev.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.dev.api.model.Pessoa;
import com.dev.api.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping("/")
	public List<Pessoa> buscarTodos(){
		return pessoaService.listar();
	}
	
	@PostMapping("/")
	public Pessoa salvar(@RequestBody Pessoa pessoa) {
		return pessoaService.salvar(pessoa);
	}
	
	@PutMapping("/")
	public Pessoa atualizar(@RequestBody Pessoa pessoa) {
		return pessoaService.actualizar(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable ("id") Long id){
		pessoaService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
