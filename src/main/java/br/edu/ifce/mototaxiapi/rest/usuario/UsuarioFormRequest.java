package br.edu.ifce.mototaxiapi.rest.usuario;

import br.edu.ifce.mototaxiapi.model.Endereco;
import br.edu.ifce.mototaxiapi.model.Usuario;

public class UsuarioFormRequest {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String perfil;
	private String telefone;
	private Endereco endereco;

	
	public UsuarioFormRequest() {
		super();
	}
	
	
	public UsuarioFormRequest(Long id, String nome, String sobrenome, String email, String senha, String perfil,
			String telefone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public Usuario toModel() {
		return new Usuario(nome, sobrenome, email, senha, perfil, telefone, endereco);
	}
	
	public static UsuarioFormRequest fromModel(Usuario usuario) {
		return new UsuarioFormRequest(
				usuario.getId(),
				usuario.getNome(),
				usuario.getSobrenome(),
				usuario.getEmail(),
				usuario.getSenha(),
				usuario.getPerfil(),
				usuario.getTelefone(),
				usuario.getEndereco()
				);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}
	
	
}
