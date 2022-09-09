package com.dev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
