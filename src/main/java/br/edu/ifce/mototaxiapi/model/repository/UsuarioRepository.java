package br.edu.ifce.mototaxiapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.mototaxiapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
