package com.dev.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dev.api.model.Categoria;
import com.dev.api.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/")
	public List<Categoria> salavr() {
		
		return categoriaService.listar();
	}
	
	@PostMapping("/")
	public Categoria salvar(@RequestBody Categoria categoria) {
		
		return categoriaService.salvar(categoria);
	}
	
	@PostMapping("/")
	public Categoria actualizar(@RequestBody Categoria categoria) {
		
		return categoriaService.actualizar(categoria);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable ("id") Long id){
		
		categoriaService.excluir(id);
		
		return ResponseEntity.ok().build();
	}

}
