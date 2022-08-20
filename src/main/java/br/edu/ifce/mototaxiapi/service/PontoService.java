package br.edu.ifce.mototaxiapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifce.mototaxiapi.model.Ponto;
import br.edu.ifce.mototaxiapi.model.repository.PontoRepository;

public class PontoService {
	
	@Autowired
	private PontoRepository repository;
	
	public void salvar(Ponto ponto) {
		
		repository.save(ponto);
		
	}
	
	public void atualizar(Ponto ponto) {
		
		repository.save(ponto);
		
	}
	
	public void deletar(Long id) {
		
		repository.deleteById(id);
		
	}
}
