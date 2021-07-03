/*Faça um programa que receba três inteiros e diga qual deles é o maior*/
package lista1java;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int a,b,c;
		System.out.println(" Digite um numero inteiro: ");
		a= ler.nextInt();
		System.out.println(" Digite um numero inteiro: ");
		b= ler.nextInt();
		System.out.println(" Digite um numero inteiro: ");
		c= ler.nextInt();
	
		 if(a>b && a>c ) {
			 System.out.println("O numero "+a+" é o maior dos tres" );
		 }if(b>a && b>c ) {
			 System.out.println("O numero "+b+" é o maior dos tres" );
	}if(c>a && c>b ) {
		 System.out.println("O numero "+c+" é o maior dos tres" );
	}		 else {
		System.out.println("Digite pelo menos um numero diferente ");
	} 
}
	}