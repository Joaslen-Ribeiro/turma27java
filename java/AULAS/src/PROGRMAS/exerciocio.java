package PROGRMAS;

import java.util.Scanner;

import OrientacaoOBEJTO.cliente;

public class exerciocio {
	 public static void main(String[] args) { 
		 Scanner leia= new Scanner(System.in);
		  cliente cliente1= new cliente();
		 
		 System.out.println("Qual seu nome: ");
		 cliente1.nome=leia.next();
		 System.out.println("Tem algum nome social de sua preferencia? Digite: ");
		 cliente1.nomeSocial=leia.next();
		 System.out.println("Qual seu ano de nascimento: ");
		 cliente1.anoN=leia.nextInt();
		 System.out.println("Digite seu CPF: ");
		 cliente1.cpf=leia.nextInt();
		 System.out.println("Em que ano o senhore se tornou cliente: ");
		 cliente1.tempodeC=leia.nextInt();
		 
		 
		 
		 System.out.printf("\nOla senhore %s ",cliente1.nome);
		 System.out.printf(" ou como preferir pode ser: %s",cliente1.nomeSocial );
		 System.out.printf("\nDetentore do CPF: %d",cliente1.cpf);
		 System.out.printf(" \nsua idade é %d ",cliente1.idade(2021));
		 
		 System.out.printf("\no senhor é nosso cliente a %d ",cliente1.clienteEspecial(2021)," anos " );
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }

}
