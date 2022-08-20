package br.edu.ifce.mototaxiapi.rest.ponto;

import br.edu.ifce.mototaxiapi.model.Endereco;
import br.edu.ifce.mototaxiapi.model.Ponto;

public class PontoFormRequest {
	
	private Long id;
	private String nome;
	private Double latitude;
	private Double longitude;
	private Endereco endereco;
	
	public PontoFormRequest() {
		super();
	}
	
	public PontoFormRequest(Long id, String nome, Double latitude, Double longitude, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.endereco = endereco;
	}
	
	public Ponto toModel() {
		return new Ponto(nome, latitude, longitude, endereco);
	}
	
	public static PontoFormRequest fromModel(Ponto ponto) {
		return new PontoFormRequest(
				ponto.getId(),
				ponto.getNome(),
				ponto.getLatitude(),
				ponto.getLongitude(),
				ponto.getEndereco()
				);
		
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
