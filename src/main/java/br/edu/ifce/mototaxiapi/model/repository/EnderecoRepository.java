package br.edu.ifce.mototaxiapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.mototaxiapi.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>  {

}
