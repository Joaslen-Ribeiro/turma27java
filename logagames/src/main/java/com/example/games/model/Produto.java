package com.example.games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto " )
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private long id;
	
	@NotBlank
	@Size(min = 4, max=20 )
	private String nome;
	
	@Min(1)	
	private double preco;
	
	
	private boolean disponivel;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public double getPreco() {
		return preco;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
	
	
}
