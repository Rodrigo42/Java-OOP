package com.java;

import java.io.Serializable;

public class Conta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
	private double saldo;
	private int numero;
	
	public Conta() {
		
	}
	
	public Conta (int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public int getAgencia() {
		return agencia;
		
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	public void retirar(int valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
