/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria
 ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/
package lista1java;

import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int idade;
		System.out.println("digite sua idade entre 10 e 25 anos: ");
		 idade= ler.nextInt();
		 
		 if(idade>=10 && idade<=14 ) {
			 System.out.println("voce tem "+ idade+" anos, sua categoria é Infantil");
		 }
		 if(idade>=15 && idade<=17 )  {
			 System.out.println("voce tem "+ idade+" anos, sua categoria é Juvenil");
		 }
		  if (idade>=18 && idade<=25) {       
			 System.out.println("voce tem "+ idade+" anos, sua categoria é Adulto");
		 }
		  else {  System.out.println("A idade que voce colocou nao se encaixa na nossa escala ");           }

	}

}
