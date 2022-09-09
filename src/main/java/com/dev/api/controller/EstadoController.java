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

import com.dev.api.model.Estado;
import com.dev.api.service.EstadoService;

@RestController
@RequestMapping("/estado")
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/")
	public List<Estado> buscar(){
		
		return estadoService.listarEstado();
	}
	
	@PostMapping("/")
	public Estado salvar(@RequestBody Estado estado) {
		
		return estadoService.salvar(estado);
	}
	
	@PutMapping("/")
	public Estado update(@RequestBody Estado estado) {
		
		return estadoService.Actualizar(estado);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> exluir(@PathVariable ("id") Long id){
		
		estadoService.apagar(id);
		
		return ResponseEntity.ok().build();
	}
	
	

}
