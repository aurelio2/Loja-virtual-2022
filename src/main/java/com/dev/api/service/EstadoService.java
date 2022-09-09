package com.dev.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.Estado;
import com.dev.api.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;

	//method de listar no service
	public List<Estado> listarEstado(){
		
		return estadoRepository.findAll();
	}
	
	
	//methpod de salvar
	public Estado salvar(Estado estado) {
		estado.setDataCriacao(new Date());
		return estadoRepository.saveAndFlush(estado);
		
		
	}
	
	public Estado Actualizar(Estado estado) {
	
		return estadoRepository.saveAndFlush(estado);
		
	}
	
	public void apagar(Long id) {
		
		//primeiro pegar o nosso id
		Estado estado = estadoRepository.findById(id).get(); //5
		
		
		//delete method
		estadoRepository.delete(estado);
		
		
	}


}
