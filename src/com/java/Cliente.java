package com.java;

public class Cliente extends Pessoa {
	
	private int conta;
	private String tipo;
	
	
	
	public Cliente(String nome, int cep) {
		super(nome, cep);
		// TODO Auto-generated constructor stub
	}

	public Cliente() {
		
	}
	
	public Cliente(String nome, int cep, int conta, String tipo){
		super(nome, cep);
		this.conta = conta;
		this.tipo = tipo;
		
		
	}

	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
