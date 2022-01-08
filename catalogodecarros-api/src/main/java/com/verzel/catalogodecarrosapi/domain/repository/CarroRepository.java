package com.verzel.catalogodecarrosapi.domain.repository;

import java.util.List;
import java.util.Optional;

import com.verzel.catalogodecarrosapi.domain.model.Carro;

public interface CarroRepository extends CustomJpaRepository<Carro, Long> {
	
	List<Carro> findTodasByNomeContaining(String nome);
	
	Optional<Carro> findByNome(String nome);
	
	boolean existsByNome(String nome);

}
