package br.edu.ifce.mototaxiapi.rest.ponto;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.edu.ifce.mototaxiapi.model.Endereco;
import br.edu.ifce.mototaxiapi.model.Ponto;
import br.edu.ifce.mototaxiapi.model.repository.PontoRepository;
import br.edu.ifce.mototaxiapi.service.PontoService;

@RestController
@RequestMapping("/api/ponto")
@CrossOrigin("*")
public class PontoController {
	
	
	@Autowired
	private PontoService pontoService;
	
	@Autowired
	private PontoRepository pontoRepository;
	
	@GetMapping
	public List<PontoFormRequest> getLista(){
		return pontoRepository.findAll().stream()
						.map(PontoFormRequest::fromModel )
						.collect(Collectors.toList());
	}
	
	@JsonIgnoreProperties
	@PostMapping
	public PontoFormRequest salvar(@RequestBody PontoFormRequest ponto) {
		Ponto entityPonto = ponto.toModel();
		Endereco entityEndereco = entityPonto.getEndereco();
		entityEndereco.setPonto(entityPonto);
		pontoService.salvar(entityPonto);
		return PontoFormRequest.fromModel(entityPonto);
	}
	
	@PutMapping("/editar")
	public ResponseEntity<Void> atualizar(@RequestParam("id") Long id, @RequestBody PontoFormRequest ponto) {
		Optional<Ponto> pontoExistente = pontoRepository.findById(id);
		
		if(pontoExistente.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Ponto entityPonto = ponto.toModel();
		entityPonto.setId(id);
		pontoService.atualizar(entityPonto);
		
		return ResponseEntity.ok().build();
		
	}
	
	@DeleteMapping("/deletar")
	public ResponseEntity<Void> deletar(@RequestParam("id") Long id){
		Optional<Ponto> pontoExistente = pontoRepository.findById(id);
		
		if(pontoExistente.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		pontoService.deletar(pontoExistente.get().getId());
		return ResponseEntity.noContent().build();
		
	}
	
}
