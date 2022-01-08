package com.verzel.catalogodecarrosapi.domain.service;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.verzel.catalogodecarrosapi.domain.exception.EntidadeEmUsoException;
import com.verzel.catalogodecarrosapi.domain.exception.EntidadeNaoEncontradaException;
import com.verzel.catalogodecarrosapi.domain.model.Carro;
import com.verzel.catalogodecarrosapi.domain.repository.CarroRepository;

@Service
public class CadastroCarroService {
	
	private static final String MSG_CARRO_EM_USO = 
			"Carro de código %d não pode ser removida, pois está em uso";
	
	private static final String MSG_CARRO_NAO_ENCONTRADO = 
			"Não existe um cadastro de carro com código %d";
	
	private CarroRepository carroRepository;
	
	public Carro salvar(Carro carro) {
		return carroRepository.save(carro);
	
	}
	
	public void excluir(Long carroId) {
		try {
			carroRepository.deleteById(carroId);
		} catch (EmptyResultDataAccessException e) {
			
			throw new EntidadeNaoEncontradaException(String.format(MSG_CARRO_NAO_ENCONTRADO, carroId));
		
		} catch(DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format(MSG_CARRO_EM_USO, carroId));
		}
	}
	
	

}
