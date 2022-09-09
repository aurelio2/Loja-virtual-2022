package com.dev.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.Categoria;
import com.dev.api.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> listar() {

		return categoriaRepository.findAll();
	}

	public Categoria salvar(Categoria categora) {
		Categoria novaCategoria = categoriaRepository.saveAndFlush(categora);

		return novaCategoria;

	}

	public Categoria actualizar(Categoria categora) {
		return categoriaRepository.saveAndFlush(categora);
	}
	
	public void excluir(Long id) {	
		Categoria categoriaId = categoriaRepository.findById(id).get();
		categoriaRepository.delete(categoriaId);
	}

}
