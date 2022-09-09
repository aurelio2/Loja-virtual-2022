package com.dev.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.dev.api.model.Permissao;
import com.dev.api.service.PermissaoService;

@RestController
@RequestMapping("/permissao")
public class PermissaoController {

	@Autowired
	private PermissaoService service;
	
	@GetMapping("/")
	public List<Permissao> buscarTodos(){		
		return service.listar();
	}
	
	@PostMapping("/")
	public Permissao salvar(@RequestBody Permissao permissao) {
		
		return service.salvar(permissao);
	}
	
	
	@PutMapping("/")
	public Permissao actualizar(@RequestBody Permissao permissao) {
		
		return service.salvar(permissao);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		
		service.excluir(id);
		
		return ResponseEntity.ok().build();
	}
	
}
