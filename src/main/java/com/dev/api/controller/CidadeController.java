package com.dev.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.api.model.Cidade;
import com.dev.api.service.CidadeService;

@RestController
@RequestMapping("/cidade")
public class CidadeController {
	
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping("/")
	public List<Cidade> buscar(){
		
		return cidadeService.listar();
	}
	
	@PostMapping("/")
	public Cidade salvar(@RequestBody Cidade cidade) {
		
		return cidadeService.salvar(cidade);
	}
	
	@PutMapping("/")
	public Cidade actualizar(@RequestBody Cidade cidade) {
		
		return cidadeService.actualizar(cidade);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable ("id") Long id){
		
		cidadeService.apagar(id);
		
		return ResponseEntity.ok().build();
	}
	
	
	
	
	

}
