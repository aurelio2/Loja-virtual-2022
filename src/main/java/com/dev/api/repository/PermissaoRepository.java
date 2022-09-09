package com.dev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.api.model.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
