package com.dev.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.Pessoa;
import com.dev.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	public List<Pessoa> listar() {

		return repository.findAll();
	}

	public Pessoa salvar(Pessoa pessoa) {

		Pessoa novaPessoa = repository.saveAndFlush(pessoa);

		return novaPessoa;
	}

	public Pessoa actualizar(Pessoa pessoa) {

		return repository.saveAndFlush(pessoa);
	}
	
	public void excluir(Long id) {
		
		Pessoa pessoaId= repository.findById(id).get();
		
		repository.delete(pessoaId);
	}
}
