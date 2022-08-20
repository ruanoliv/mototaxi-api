package br.edu.ifce.mototaxiapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.mototaxiapi.model.Ponto;

public interface PontoRepository extends JpaRepository<Ponto, Long>  {

}
