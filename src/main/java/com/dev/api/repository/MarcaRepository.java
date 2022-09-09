package com.dev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.api.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
