package com.dev.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.api.model.Permissao;
import com.dev.api.repository.PermissaoRepository;

@Service
public class PermissaoService {

	@Autowired
	private PermissaoRepository repo;

	public List<Permissao> listar() {
		return repo.findAll();
	}

	public Permissao salvar(Permissao permissao) {
		return repo.saveAndFlush(permissao);
	}

	public Permissao actualizar(Permissao permissao) {
		return repo.saveAndFlush(permissao);
	}
	
	public void excluir(Long id) {
		//pegar o id
		Permissao permissaoId = repo.findById(id).get();
		
		repo.delete(permissaoId);
	}

}
