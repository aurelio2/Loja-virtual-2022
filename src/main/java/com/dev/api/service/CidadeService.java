package com.dev.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.Cidade;
import com.dev.api.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public List<Cidade> listar(){
		
		return cidadeRepository.findAll();
	}
	
	public Cidade salvar(Cidade cidade) {
		
		cidade.setDataCriacao(new Date());	
		Cidade cidadeNova = cidadeRepository.saveAndFlush(cidade);
	
		return cidadeNova;	
	}
	
	public Cidade actualizar(Cidade cidade) {
		
		return cidadeRepository.saveAndFlush(cidade);
	}
	
	public void apagar (Long id) {
		
		//primeiro pegar o idade
		Cidade cidade = cidadeRepository.findById(id).get();
		
		cidadeRepository.delete(cidade);
	}
	
	

}
