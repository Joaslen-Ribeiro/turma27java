package com.example.games.model;


public class UsuarioLogin {
	
	
	private long id;
	

	private String nome;
	
	
	private String usuario;
	
	
	private String senha;
	
	private String token;
	
	

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public String getToken() {
		return token;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
