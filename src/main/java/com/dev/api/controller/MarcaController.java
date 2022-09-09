package com.dev.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dev.api.model.Marca;
import com.dev.api.service.MarcaService;


@RestController
@RequestMapping("/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("/")
	public List<Marca> buscar(){
		
		return marcaService.listar();
	}
	
	@PostMapping("/")
	public Marca salvar(@RequestBody Marca marca) {
		
		return marcaService.salvar(marca);
	}
	
	@PutMapping("/")
	public Marca actualizar(@RequestBody Marca marca) {
		
		return marcaService.Actulizar(marca);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable ("id") Long id){
		
		marcaService.excluir(id);
		
		return ResponseEntity.ok().build();
	}


}
