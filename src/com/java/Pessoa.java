package com.java;

public class Pessoa {
	
	private String nome;
	private int cep;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int cep) {
		this.nome = nome;
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
}
