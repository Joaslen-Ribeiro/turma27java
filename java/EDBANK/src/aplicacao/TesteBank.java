package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class TesteBank {
	public static void main (String[] args) {
		Scanner leia=new Scanner(System.in);
		
		Conta cli1 = new Conta(34, "ARIEL");
		double valor;
		String nome;
		int numero;
		
		System.out.println("digite o nome do cliente");
		nome =leia.next();
		
		System.out.println("Cliente : "+cli1.getNomeCliente());
		System.out.println("saldo atual : R$ "+cli1.getSaldo());
		System.out.println(" digite o valor do credito ");
		valor=leia.nextDouble();
		cli1.Credito(valor);
		System.out.println("saldo atual : R$ "+cli1.getSaldo());
		cli1.Credito(200);;
		System.out.println("saldo atual : R$ "+cli1.getSaldo());
	} 

}
