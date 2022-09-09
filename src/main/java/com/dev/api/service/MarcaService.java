package com.dev.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.Marca;
import com.dev.api.repository.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	private MarcaRepository marcaRepository;

	
	public List<Marca> listar(){		
		return marcaRepository.findAll();
	}

	
	public Marca salvar(Marca marca) {
		marca.setDataCriacao(new Date());
		
		Marca novaMarca = marcaRepository.saveAndFlush(marca);		
		return novaMarca;
	}
	
	public Marca Actulizar(Marca marca) {
		
		return marcaRepository.saveAndFlush(marca);
	}
	
	public void excluir(Long id) {
		
		//pegar id
		Marca marcaId = marcaRepository.findById(id).get();
		
		marcaRepository.delete(marcaId);
	}
}
