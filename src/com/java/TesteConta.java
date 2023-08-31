package com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.depositar(100);
		cc.retirar(25);
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(500, 1010, 1024);
		poupanca.depositar(10000);
		poupanca.retirar(1000);
		System.out.println(poupanca.getSaldo());
		
		Cliente clienteUm = new Cliente();
		clienteUm.setNome("Roberval");
		System.out.println(clienteUm.getNome());
		clienteUm.setTipo("Pessoa Fisica");
		System.out.println(clienteUm.getTipo());
		clienteUm.setConta(123);
		System.out.println(clienteUm.getConta());
		clienteUm.setCep(1234565);
		System.out.println(clienteUm.getCep());
		
		Cliente clienteDois = new Cliente("Homero", 04567555, 5546, "Pessoa Fisica");
		System.out.println(clienteDois.getCep());
		System.out.println(clienteDois.getNome());
		System.out.println(clienteDois.getTipo());
		System.out.println(clienteDois.getConta());
		
		
		
		
		
	}
}
