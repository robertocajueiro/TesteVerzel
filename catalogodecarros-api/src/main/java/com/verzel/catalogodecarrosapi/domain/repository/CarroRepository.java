package com.verzel.catalogodecarrosapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verzel.catalogodecarrosapi.domain.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
