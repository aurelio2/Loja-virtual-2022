package com.dev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
