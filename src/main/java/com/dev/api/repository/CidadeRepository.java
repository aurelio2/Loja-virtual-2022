package com.dev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.api.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
