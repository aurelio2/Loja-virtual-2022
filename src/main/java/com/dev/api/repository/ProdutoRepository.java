package com.dev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
