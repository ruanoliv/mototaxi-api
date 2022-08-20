package br.edu.ifce.mototaxiapi.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ponto")
public class Ponto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double latitude;
	private Double longitude;
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	public Ponto() {
		super();
	}

	public Ponto(String nome, Double latitude, Double longitude, Endereco endereco) {
		super();
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
}
